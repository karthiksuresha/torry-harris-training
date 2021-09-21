public class Box {
    private int length;
    private int width;
    private int height;
    public void initialize(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    public void display() {
        System.out.println("Length=" + length);
        System.out.println("Width=" + width);
        System.out.println("Height" + height);
    }
    public int getvolume()
    {
        return length*width*height;
    }
}
