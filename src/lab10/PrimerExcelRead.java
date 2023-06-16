package lab10;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
public class PrimerExcelRead {
    public static void main(String[] args) {
        // Open file Excel for read
        String filePath = "Programming_Git/src/lab10/exampleCreateExcel.xlsx";
        try {
            FileInputStream inputStream = new FileInputStream(filePath);

            // Create Instance book Excel from file
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Get list from book for her name
            XSSFSheet sheet = workbook.getSheet("Товары");

            // Enumerate(перебер)|Sort out row and cell
            for (Row row : sheet){
                for (Cell cell : row){
                    // Print value cell for console
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

            // Close Open File and free up resources
            workbook.close();
            inputStream.close();
        } catch (IOException e){
            System.out.println("Ошибка ввода вывода");
            e.printStackTrace();
        } catch (IllegalStateException e){
            System.out.println("ПРоверьте структуру и содержимое файла Excel");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Программа пытается обратиться к несуществующему элементу");
        }
    }
}
