package lab10;
import lab10.ParserXml;
import lab10.Book;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class ParserJson {
    private List<Book> books = new ArrayList<>();
    private static final String TAG_BOOK = "books";
    private static final String TAG_TITLE = "title";
    private static final String TAG_AUTHOR = "author";
    private static final String TAG_YEAR = "year";

    private String filePath = "Programming_Git/src/lab10/exampleJsonToJsonParser.json";

    public List<Book> parser(){
        String title = "";
        String author = "";
        int year = 0;

        JSONArray jsonArray = getJson();

        assert jsonArray != null;
        for (Object o : jsonArray){
            JSONObject objectJson = (JSONObject) o;
            title = (String) objectJson.get(TAG_TITLE);
            author = (String) objectJson.get(TAG_AUTHOR);
            year = Integer.parseInt(objectJson.get(TAG_YEAR).toString());
            Book book = new Book(title, author, year);
            books.add(book);
        }

        return books;
    }

    public void addNewBook(){
        JSONArray jsonArray= getJson();
        JSONObject jsonNewBook = new JSONObject();
        System.out.println();
        Book newBook = ParserXml.newBook();
        jsonNewBook.put(TAG_TITLE, newBook.getTitle());
        jsonNewBook.put(TAG_AUTHOR, newBook.getAuthor());
        jsonNewBook.put(TAG_YEAR, newBook.getYear());
        jsonArray.add(jsonNewBook);

        writeDate(jsonArray);

        System.out.println("Новая книга добавлена в Json");
    }

    public void deleteBook(){
        Scanner in = new Scanner(System.in);
        JSONArray jsonArray= getJson();

        System.out.println("Введите название книги которую необходимо удалить:");
        String title = in.nextLine();
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()){
            JSONObject book = (JSONObject) iterator.next();
            if (title.equals(book.get(TAG_TITLE))){
                iterator.remove();
                writeDate(jsonArray);
                return;
            }
        }
        System.out.println("Книга не найдена");

    }
    private JSONArray getJson (){
        try {
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader(filePath));
            JSONObject jsonObject = (JSONObject) obj;
            return  (JSONArray) jsonObject.get(TAG_BOOK);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private void writeDate(JSONArray jsonArray){
        try {
            FileWriter file = new FileWriter(filePath);
            JSONObject library = new JSONObject();

            library.put(TAG_BOOK, jsonArray);
            file.write(library.toString());
            file.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
