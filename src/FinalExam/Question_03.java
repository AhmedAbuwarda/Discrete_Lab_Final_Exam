/*
 * To change this template file, choose Settings | Editor | File and Code Templates
 * and change the template in the editor.
 */
package FinalExam;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Ahmed Abuwarda.
 */
class Question_03 {

    /**
     * This Method Returns Union Set.
     */
    static void Q3() {

        // Create Sets R, A , B.
        Set<Integer> R = new HashSet<>();
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Add Numbers To Set A.
        A.add(3);
        A.add(5);
        A.add(8);

        // Add Numbers To Set B.
        B.add(5);
        B.add(3);
        B.add(2);

        // Add Numbers To Set R "Using For Loop".
        for (int i = 0; i < 10; i++) {
            R.add(i);
        }

        // Create New Sets.
        Set<Integer> AunionB = new HashSet<>(A);
        AunionB.addAll(B);

        Set<Integer> removeUnion = new HashSet<>(R);
        removeUnion.removeAll(AunionB);

        Set<Integer> RremoveA = new HashSet<>(R);
        RremoveA.removeAll(A);

        Set<Integer> RremoveB = new HashSet<>(R);
        RremoveB.removeAll(B);

        Set<Integer> AinterB = new HashSet<>(RremoveA);
        AinterB.retainAll(RremoveB);

        // If Statement To Print The Result.
        if (removeUnion.containsAll(AinterB)) {
            System.out.println("\n *** Question_03 ***\n(A u B)\" = " + removeUnion);
            System.out.println("(A' u B') = " + AinterB);
            System.out.println("\nThe formula is true (^_^)");
        } else {
            System.out.println("\nThe formula is not true (!_!)");
        }

    }

    /*
      Or you can use this code...

              System.out.println("A = " + A + "B = " + B);
              Set<Integer> AuB = new HashSet<>(A);
              AuB.addAll(B);

              System.out.println("AuB = " + AuB);
              Set<Integer> AuBInvers = Invers(R, AuB);
              System.out.println("AuBInvers = " + AuBInvers);

              Set<Integer> AInvers = Invers(R, A);
              System.out.println("AInvers = " + AInvers);

              Set<Integer> BInvers = Invers(R, B);
              System.out.println("BInvers = " + BInvers);

              Set<Integer> AInvnBInv = new HashSet<>(AInvers);
              AInvnBInv.retainAll(BInvers);
              System.out.println("AInvnBInv = " + AInvnBInv);

              System.out.println("End : " + AuBInvers + "   " + AInvnBInv);

              if (AuBInvers.equals(AInvnBInv)) {
                  System.out.println("The formula is True (^_^)");
              } else {
                  System.out.println("false");
              }
              public static Set<Integer> Invers(Set<Integer> A, Set<Integer> B) {
                   Set<Integer> Invers = new HashSet<>(A);
                   Invers.removeAll(B);
                   return Invers;
              }
     */

}