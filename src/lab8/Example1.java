package lab8;
import java.io.File;
public class Example1 {
    public static void main(String[] args) {
        try {
            // создание файла в текущей папке Programming_Git/test_Folder/
            File f1 = new File("Programming_Git/test_Folder/MyFile.txt");
            f1.createNewFile();
            if(f1.exists()){
                System.out.println("создан!!!!");
                System.out.println("Полный путь 1: " + f1.getAbsolutePath());
            }

            // Создание нескольки вложенны папок
            File f3 = new File("Programming_Git/test_Folder/Path1/Path2");
            f3.mkdirs();
            System.out.println("Полный путь 3: " + f3.getAbsolutePath());

            // Создание файла в домашней директории пользователя, и вывод полного пути
            File f2 = new File("Programming_Git/test_Folder/testFile1.txt");
            f2.createNewFile();
            System.out.println("Полный путь 2: " + f2.getAbsolutePath());


        } catch (Exception e){
            System.out.println("Ошибка!!!! " + e);
        }
    }
}
