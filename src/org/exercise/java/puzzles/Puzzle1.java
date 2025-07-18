// 🟢Puzzle 1: Somma dei numeri dispari 

// Descrizione:
// Calcolare la somma di tutti i numeri dispari in un array di interi.
// Firma metodo attesa:
// public static int sommaDispari(int[]numeri)

package org.exercise.java.puzzles;

public class Puzzle1 {

    public static int sommaDispari(int[] numbers) {

        int sum = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                sum += number;
            }
        }

        return sum;
    }
}
