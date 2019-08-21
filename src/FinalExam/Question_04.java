/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */
package FinalExam;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Ahmed Abuwarda
 */
public class Question_04 {

    /**
     * @return Set from .xlsx file
     */
    public static void Q4() {

        Set<Set<String>> setA = getAllListOfCarsInExcel("carParkingA.xlsx");
        Set<Set<String>> setB = getAllListOfCarsInExcel("carParkingB.xlsx");
        System.out.println("\n setA: " + setA);
        System.out.println("\n setB: " + setB);
        setA.retainAll(setB);
        System.out.println(setA.size() + " user have piles in the first and second");
    }

    private static Set<Set<String>> getAllListOfCarsInExcel(String file) {

        Set<String> setList;
        Set<Set<String>> set = new HashSet<>();
        try {
            FileInputStream excelFile2 = new FileInputStream(new File(file));
            Workbook workbook = new XSSFWorkbook(excelFile2);
            Sheet datatypeSheet = workbook.getSheetAt(0);

            // this for one row from sheet
            for (Row currentRow : datatypeSheet) {
                Iterator<Cell> cellIterator = currentRow.iterator();// the raw have many cell
                setList = new HashSet<>();
                while (cellIterator.hasNext()) {
                    Cell currentCell = cellIterator.next();
                    setList.add(String.valueOf(currentCell));
                }
                set.add(setList);
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        return set;
    }
}