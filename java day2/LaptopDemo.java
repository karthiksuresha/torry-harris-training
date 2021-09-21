public class LaptopDemo {
    public static void main(String[] args)
    {
        Laptop hp = new Laptop();
        hp.initialize(8,1024,"Intel",15.7 );
        System.out.println("HP Laptop specifications:");
        hp.display();

        System.out.println();

        Laptop dell = new Laptop();
        dell.initialize(16,2048,"AMD",13.5 );
        System.out.println("DELL Laptop specifications:");
        dell.display();
    }
}
