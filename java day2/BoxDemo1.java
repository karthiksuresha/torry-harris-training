public class BoxDemo1 {
    public static void main(String[] args)
    {
        Box1 b1 = new Box1();
        b1.setLength(100);
        b1.setWidth(50);
        b1.setHeight(200);
        b1.display();
        System.out.println("volume of box1 is:"+b1.getvolume());

        System.out.println();

        b1.setLength((110 * b1.getLength()) / 100);
        b1.setWidth((120 * b1.getWidth()) / 100);
        b1.setHeight((108 * b1.getHeight()) / 100);
        b1.display();
        System.out.println("volume of box1 is:"+b1.getvolume());
    }
}
