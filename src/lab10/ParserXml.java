package lab10;
import lab10.Book;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParserXml {
    private List<Book> books = new ArrayList<>();
    //    private static final String TAG_NAME_MAIN = "library";
    private static final String TAG_BOOK = "book";
    private static final String TAG_TITLE = "title";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_YEAR = "year";

    public List<Book> parse(){
        Document doc;
        try {
            doc = buildDocument();
        } catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
            return null;
        }

        Node libraryNode = doc.getFirstChild();
        books = parsBookTag(libraryNode);

        return books;
    }



    private Document buildDocument() throws Exception{
        File file = new File("Programming_Git/src/lab10/exampleAddNewBook.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        return dbf.newDocumentBuilder().parse(file);
    }

    private List<Book> parsBookTag(Node libraryNode){
        List<Book> listBook = new ArrayList<>();
        NodeList bookChilds = libraryNode.getChildNodes();

        for (int i = 0; i < bookChilds.getLength(); i++){
            if (bookChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Book book = parseElement(bookChilds.item(i));

            listBook.add(book);
        }
        return listBook;
    }

    private Book parseElement(Node elementNode){
        String title = "";
        String author = "";
        int year = 0;

        NodeList elementChilds = elementNode.getChildNodes();

        for (int i = 0; i < elementChilds.getLength(); i++){
            if (elementChilds.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            switch (elementChilds.item(i).getNodeName()){
                case TAG_TITLE: {
                    title = elementChilds.item(i).getTextContent();
                    break;
                }
                case TAG_AUTHOR: {
                    author = elementChilds.item(i).getTextContent();
                    break;
                }
                case TAG_YEAR: {
                    year = Integer.parseInt(elementChilds.item(i).getTextContent());
                    break;
                }
            }
        }
        Book book = new Book(title, author, year);
        return book;
    }

    public static void printBook(List<Book> books, String parserType){
        System.out.println();
        System.out.println("Список книг в " + parserType + ":");
        for (Book oneBook : books){
            System.out.println();
            System.out.println("Произведение: " + oneBook.getTitle());
            System.out.println("Автор: " + oneBook.getAuthor());
            System.out.println("Год издания: " + oneBook.getYear());
        }
    }

    public void addNewBookXml() {


        Book newBook = newBook();
        Document doc = null;
        try {
            doc = buildDocument();
        } catch (Exception e){
            System.out.println(e.getStackTrace());
        }
        // Создаем element Book, в который будем передавать ранее записанные параметры новой книги.
        Element bookElement = doc.createElement(TAG_BOOK);

        // Создаем element для каждого свойства, которое необходимо заполнить для книг
        Element titleElement = doc.createElement(TAG_TITLE);
        Element authorElement = doc.createElement(TAG_AUTHOR);
        Element yearElement = doc.createElement(TAG_YEAR);
        titleElement.appendChild(doc.createTextNode(newBook.getTitle()));
        authorElement.appendChild(doc.createTextNode(newBook.getAuthor()));
        yearElement.appendChild(doc.createTextNode(newBook.getYear()));
        bookElement.appendChild(titleElement);
        bookElement.appendChild(authorElement);
        bookElement.appendChild(yearElement);

        // Добавляем ранее созданый и наполненный элемент book в "библиотеку" елементов
        // Получаем основной, "родительский" элемент и добавляем в него елемент Book
        Element libraryElement = doc.getDocumentElement();
        libraryElement.appendChild(bookElement);

        DOMSource source = new DOMSource(doc);

        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            StreamResult result = new StreamResult("Programming_Git/src/lab10/exampleAddNewBook.xml");
            transformer.transform(source, result);
        } catch (Exception e){
            e.printStackTrace();
        }


        System.out.println("Новая книга добавлена");
    }

    public void deleteBook() {
        Scanner in = new Scanner(System.in);
        Document doc = null;
        try {
            doc = buildDocument();
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Введите название книги которую необходимо удалить: ");
        String titleDeleteBook = in.nextLine();

        NodeList bookNodes = doc.getElementsByTagName("book");
        for (int i = 0; i < bookNodes.getLength(); i++){
            if (bookNodes.item(i).getNodeType() != Node.ELEMENT_NODE){
                continue;
            }
            Element bookElement = (Element) bookNodes.item(i);
            Element titleElement = (Element) bookElement.getElementsByTagName(TAG_TITLE).item(0);
            String title = titleElement.getTextContent();
            if (title.equals(titleDeleteBook)) {
                // Удаляем книгу с данным element'oм
                bookElement.getParentNode().removeChild(bookElement);

                // Записываем изменения обратно в файл
                try {
                    TransformerFactory transformerFactory = TransformerFactory.newInstance();
                    Transformer transformer = transformerFactory.newTransformer();
                    DOMSource source = new DOMSource(doc);
                    StreamResult result = new StreamResult("Programming_Git/src/lab10/exampleAddNewBook.xml");
                    transformer.transform(source, result);

                    System.out.println("Книга удалена из XML");
                    return;
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Книга не найдена");
    }


    public static List<Book> findBook(List<Book> books){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название или автора книги");
        String inputString = in.nextLine();

        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(inputString) | book.getAuthor().equalsIgnoreCase(inputString)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public static Book newBook() {
        Scanner in = new Scanner(System.in);
        System.out.println();
        System.out.println("Введите название книги: ");
        String newTitle = in.nextLine();
        System.out.println("Введите автора книги: ");
        String newAuthor = in.nextLine();
        System.out.println("Введите год издания книги: ");
        int newYear = 0;
        try {
            newYear = in.nextInt();
        } catch (NumberFormatException e){
            System.out.println("Введено не число");
            e.printStackTrace();
        }

        return new Book(newTitle, newAuthor, newYear);
    }
}
