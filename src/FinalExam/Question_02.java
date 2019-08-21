/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */
package FinalExam;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Abuwarda
 */
public class Question_02 {

    /**
     * @return group of sets
     */
    public static void Q2() {

        // Create Sets
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();
        Set<Integer> C = new HashSet<>();

        A.add(2);
        A.add(3);
        A.add(5);
        A.add(6);
        A.add(23);
        A.add(8);
        A.add(11);

        B.add(2);
        B.add(3);
        B.add(5);
        B.add(6);
        B.add(9);
        B.add(8);
        B.add(10);

        C.add(2);
        C.add(3);
        C.add(5);
        C.add(6);
        C.add(9);
        C.add(8);
        C.add(12);

        System.out.println("A = " + A);
        System.out.println("B = " + B);
        System.out.println("C = " + C);

        Set<Integer> ADiffB = new HashSet<>(A);
        ADiffB.removeAll(B);
        Set<Integer> ADiffC = new HashSet<>(A);
        ADiffC.removeAll(C);
        Set<Integer> BDiffC = new HashSet<>(B);
        BDiffC.removeAll(C);

        if (ADiffB.containsAll(ADiffC) && ADiffB.containsAll(BDiffC)) {
            System.out.println("A - B = A - C And B - C >> " + ADiffB + " = " + ADiffC + " = " + BDiffC);
        } else if (ADiffB.containsAll(ADiffC)) {
            System.out.println("A - B = A - C >> " + ADiffB + " = " + ADiffC);
        } else if (ADiffB.containsAll(BDiffC)) {
            System.out.println("A - B = B - C >> " + ADiffB + " = " + BDiffC);
        } else {
            System.out.println(ADiffB);
        }
    }
}