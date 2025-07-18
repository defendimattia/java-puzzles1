# 🧠 Java Logic Puzzles

Questa repository contiene una serie di esercizi logici realizzati in Java, pensati per esercitare la logica di programmazione, la gestione di array, stringhe e l’uso dei metodi statici in un contesto orientato agli oggetti.

Ogni esercizio è implementato in una classe separata con metodi pubblici e statici, per facilitare la modularità e i test.

---

## 📚 Elenco degli esercizi

### 🟢 Puzzle 1: Somma dei numeri dispari

**Descrizione:**  
Calcolare la somma di tutti i numeri dispari in un array di interi.

Firma metodo attesa:  
`public static int sommaDispari(int[] numeri)`

---

### 🟢 Puzzle 2: Duplicati consecutivi

**Descrizione:**  
Verificare se un array contiene elementi consecutivi uguali.

Firma metodo attesa:  
`public static boolean haDuplicatiConsecutivi(int[] array)`

---

### 🟡 Puzzle 3: Anagrammi

**Descrizione:**  
Controllare se due stringhe sono anagrammi, ovvero contengono gli stessi caratteri con la stessa frequenza, indipendentemente dall’ordine.

Firma metodo attesa:  
`public static boolean sonoAnagrammi(String a, String b)`

---

### 🟡 Puzzle 4: Prima lettera non ripetuta

**Descrizione:**  
Restituire la prima lettera in una stringa che non si ripete.

Firma metodo attesa:  
`public static Character primaNonRipetuta(String input)`

---

### 🟡 Puzzle 5: Contatore di cifre

**Descrizione:**  
Calcolare quante cifre contiene un numero intero positivo.

Firma metodo attesa:  
`public static int contaCifre(int numero)`

---

### 🟠 Puzzle 6: Parentesi bilanciate

**Descrizione:**  
Verificare se una stringa composta da sole parentesi tonde è bilanciata (ogni parentesi aperta ha una chiusura corretta).

Firma metodo attesa:  
`public static boolean parentesiBilanciate(String input)`

---

### 🔴 Puzzle 7: Numeri mancanti

**Descrizione:**  
Dato un array di numeri interi e un valore massimo max, restituire la lista dei numeri mancanti da 1 a max.

Firma metodo attesa:  
`public static List<Integer> numeriMancanti(int[] array, int max)`

---

### 🟠 Puzzle 8: Conta vocali

**Descrizione:**  
Contare il numero di vocali (a, e, i, o, u, sia minuscole che maiuscole) presenti in una stringa.

Firma metodo attesa:  
`public static int contaVocali(String testo)`

---

## 🛠️ Modalità di sviluppo

- Ogni esercizio è organizzato in una classe separata.  
- I metodi principali sono public static per permettere una facile chiamata senza necessità di istanziare oggetti.  
- Un file Main.java (o simile) può essere usato per testare tutti i metodi richiamandoli con esempi.

---

