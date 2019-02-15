package main.java.fung.model;

public class ColourPrinter extends Printer {
    @Override
    public void feature() {
        super.feature();
        System.out.println("可以打印彩色纸");
    }
}
