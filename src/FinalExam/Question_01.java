/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */
package FinalExam;

import java.util.Scanner;

/**
 * @author Ahmed Abuwarda
 */
public class Question_01 {

    /**
     * @return A number in different format
     */
    public static void Q1() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please! Enter counting system");
        System.out.print("From ");//ex 2 - 8 - 10 - 16 
        int countSystemFrom = scan.nextInt();
        System.out.print("To ");//ex 2 - 8 - 10 - 16 
        int countSystemTo = scan.nextInt();
        System.out.println("please! Enter number");
        String getNum = scan.next(); // 
        int num = 0;

        switch (countSystemFrom) {
            case 16:
                try {
                    num = Integer.parseInt(getNum, 16);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }

            case 8:
                try {
                    num = Integer.parseInt(getNum, 8);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 2:
                try {
                    num = Integer.parseInt(getNum, 2);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            case 10:
                try {
                    num = Integer.parseInt(getNum);
                    break;
                } catch (Exception e) {
                    System.out.println("Error");
                    break;
                }
            default:
                System.out.println("Error");
                break;
        }

        System.out.print("The reasult is : ");
        if (countSystemTo == 8) {
            System.out.println(Integer.toOctalString(num));
        } else if (countSystemTo == 16) {
            System.out.println(Integer.toHexString(num));
        } else if (countSystemTo == 2) {
            System.out.println(Integer.toBinaryString(num));
        } else {
            System.out.println(num);
        }
    }
}