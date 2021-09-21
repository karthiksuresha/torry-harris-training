public class Boxdemo {
    public static void main(String[] args)
        {
            Box b1 = new Box();
            b1.initialize(10,5,8);
            b1.display();
            System.out.println("volume of box1 is:"+b1.getvolume());
        }
}
