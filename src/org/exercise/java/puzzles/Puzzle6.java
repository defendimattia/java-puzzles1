// ###🟠Puzzle 6:Parentesi bilanciate

// **Descrizione:
// Verificare se una stringa composta da sole parentesi tonde è bilanciata(ogni parentesi aperta ha una chiusura corretta).

// Firma metodo attesa:
// public static boolean parentesiBilanciate(String input)

package org.exercise.java.puzzles;

import java.util.ArrayList;
import java.util.List;

public class Puzzle6 {
    public static boolean parentesiBilanciate(String input) {

        if (input.length() % 2 != 0) {
            return false;
        }

        char[] charArray = input.toCharArray();

        if (charArray[0] == ')' || charArray.length > 2 && charArray[charArray.length - 1] == '(') {
            return false;
        }

        int counter = 0;

        for (char c : charArray) {

            if (counter == -1) {
                return false;
            }

            if (c == '(') {
                counter++;
            } else if (c == ')') {
                counter--;
            }
        }

        return counter == 0;
    }
}
