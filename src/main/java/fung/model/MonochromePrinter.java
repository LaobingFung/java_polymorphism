package main.java.fung.model;

public class MonochromePrinter extends Printer {
    @Override
    public void feature() {
        super.feature();
        System.out.println("只能打印黑白纸");
    }
}
