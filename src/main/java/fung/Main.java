package main.java.fung;

import main.java.fung.model.ColourPrinter;
import main.java.fung.model.MonochromePrinter;
import main.java.fung.model.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.feature();
        Printer colourPrinter = new ColourPrinter();
        colourPrinter.feature();
        Printer monochromePrinter = new MonochromePrinter();
        monochromePrinter.feature();
    }
}
