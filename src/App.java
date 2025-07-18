
import org.exercise.java.puzzles.Puzzle1;
import org.exercise.java.puzzles.Puzzle2;

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
    }
}
