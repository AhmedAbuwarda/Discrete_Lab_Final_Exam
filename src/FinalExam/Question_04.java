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
 * @author Ahmed Abuwarda.
 */
class Question_04 {

    // This Method Returns A Set from .xlsx file.
    static void Q4() {

        // Create Sets setA , setB.
        Set<Set<String>> setA = getAllListOfCarsInExcel("Files\\carParkingA.xlsx");
        Set<Set<String>> setB = getAllListOfCarsInExcel("Files\\carParkingB.xlsx");

        // Print Old Sets.
        System.out.println("\n *** Question_04 ***\nsetA: " + setA);
        System.out.println("\nsetB: " + setB);

        setA.retainAll(setB);
        System.out.println("\n" + setA.size() + " user have piles in the first and second.");

    }

    /**
     * @param file Any .xlsx File.
     * @return Set.
     */
    private static Set<Set<String>> getAllListOfCarsInExcel(String file) {

        // Create Sets setList , set.
        Set<String> setList;
        Set<Set<String>> set = new HashSet<>();

        // Try Catch Block.
        try {

            FileInputStream excelFile2 = new FileInputStream(new File(file));
            Workbook workbook = new XSSFWorkbook(excelFile2);
            Sheet datatypeSheet = workbook.getSheetAt(0);

            // this for one row from sheet.
            for (Row currentRow : datatypeSheet) {

                Iterator<Cell> cellIterator = currentRow.iterator();// the raw have many cell
                setList = new HashSet<>();

                // While Statement.
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