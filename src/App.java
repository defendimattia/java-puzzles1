
import org.exercise.java.puzzles.Puzzle1;
import org.exercise.java.puzzles.Puzzle2;
import org.exercise.java.puzzles.Puzzle3;
import org.exercise.java.puzzles.Puzzle4;
import org.exercise.java.puzzles.Puzzle5;
import org.exercise.java.puzzles.Puzzle6;
import org.exercise.java.puzzles.Puzzle7;

public class App {
    public static void main(String[] args) throws Exception {

        // puzzle 1
        System.out.println("Puzzle 1");

        int[] ex1Numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(Puzzle1.sommaDispari(ex1Numbers));

        System.out.println("--------------------");

        // puzzle 2
        System.out.println("Puzzle 2");

        int[] ex2Numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.print(Puzzle2.haDuplicatiConsecutivi(ex2Numbers));

        System.out.println("\n--------------------");

        // puzzle 3
        System.out.println("Puzzle 3");
        System.out.print(Puzzle3.sonoAnagrammi("prova", "rpovc"));
        System.out.println("\n--------------------");

        // puzzle 4
        System.out.println("Puzzle 4");
        System.out.print(Puzzle4.primaNonRipetuta("ffhweweureuytrddhcbeewergrt"));
        System.out.println("\n--------------------");

        // puzzle 5
        System.out.println("Puzzle 5");
        System.out.print(Puzzle5.contaCifre(111111));
        System.out.println("\n--------------------");

        // puzzle 6
        System.out.println("Puzzle 6");
        System.out.print(Puzzle6.parentesiBilanciate("()()((()))"));
        System.out.println("\n--------------------");

        // puzzle 7
        System.out.println("Puzzle 7");
        System.out.print(Puzzle7.numeriMancanti(new int[] { 5, 7, 9, 14, 27, 30 }, 31));
        System.out.println("\n--------------------");
    }
}
