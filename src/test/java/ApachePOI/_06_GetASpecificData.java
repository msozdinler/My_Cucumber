package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class _06_GetASpecificData {
    public static void main(String[] args) throws IOException {
//        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";
//
//        FileInputStream inputStream = new FileInputStream(path);
//        Workbook workbook = WorkbookFactory.create(inputStream);
//        Sheet sheet = workbook.getSheet("Login");

        System.out.println("What do you want to search?");
        Scanner scanner = new Scanner(System.in);
        String usersResponse = scanner.nextLine();
        System.out.println(usersResponse);

//        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
//            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(usersResponse)){
//                for (int j = 1; j <sheet.getRow(i).getPhysicalNumberOfCells() ; j++) {
//                    System.out.println(sheet.getRow(i).getCell(j));
//                }
//            }
//        }
    }

    public static String search(String searchKeyWord) throws IOException {
        String returnString = "";
        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchKeyWord)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    returnString+=sheet.getRow(i).getCell(j)+" ";

                }
            }
        }
        return returnString;
    }
}
