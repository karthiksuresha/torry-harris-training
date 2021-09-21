public class Laptop {
    private int RAM;
    private int ROM;
    private String Processor;
    private double screensize;

    public void initialize(int ram, int rom, String proc, double scrsize) {
        RAM=ram;
        ROM=rom;
        Processor=proc;
        screensize=scrsize;
    }

    public void display() {
        System.out.println("RAM: " + RAM +" GB");
        System.out.println("ROM: " + ROM +" GB");
        System.out.println("Processor: " + Processor);
        System.out.println("ScreenSize: " + screensize +" Inch");
    }
}
