/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */

package FinalExam;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda.
 */
class Question_01 {

    // This Method Returns A number in different format.
    static void Q1() {

        // Reading The Data From The User.
        Scanner scan = new Scanner(System.in);
        System.out.println(" *** Question_01 ***\nPlease! Enter counting system: ");
        System.out.print("From: ");  //ex 2 - 8 - 10 - 16
        int countSystemFrom = scan.nextInt();

        System.out.print("To: ");    //ex 2 - 8 - 10 - 16
        int countSystemTo = scan.nextInt();

        System.out.print("please! Enter number: ");
        String getNum = scan.next();

        int num = 0;

        // Switch Case countSystemFrom.
        switch (countSystemFrom) {

            case 16:

                // Try Catch Block.
                try {

                    // Try Catch Block.
                    num = Integer.parseInt(getNum, 16);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }

            case 8:

                // Try Catch Block.
                try {
                    num = Integer.parseInt(getNum, 8);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 2:

                // Try Catch Block.
                try {
                    num = Integer.parseInt(getNum, 2);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 10:

                // Try Catch Block.
                try {
                    num = Integer.parseInt(getNum);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }

                // Default Block.
            default:
                System.out.println("Error");
                break;

        }

        // Print The Result.
        System.out.print("The reasult is : ");

        // If Statement.
        if (countSystemTo == 8) {
            System.out.println(Integer.toOctalString(num) + "\n");
        } else if (countSystemTo == 16) {
            System.out.println(Integer.toHexString(num) + "\n");
        } else if (countSystemTo == 2) {
            System.out.println(Integer.toBinaryString(num) + "\n");
        } else {
            System.out.println(num + "\n");
        }

    }

}