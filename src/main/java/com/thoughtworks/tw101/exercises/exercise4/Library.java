package com.thoughtworks.tw101.exercises.exercise4;

import java.io.PrintStream;

public class Library {
    private String[] books;
    private PrintStream printStream;

    public Library(String[] books, PrintStream printStream) {
        this.books = books;
        this.printStream = printStream;
    }

    public String printBooksContaining(String partialBookTitle) {
        printStream.print("Books containing \"" + partialBookTitle + "\" are: \n");
        for (int i=0; i<books.length; i++)
        {
            if (books[i].contains(partialBookTitle))
            {
                printStream.print(books[i] + "\n");
            }
        }
        printStream.print("\n");
        return printStream.toString();
    }
}
