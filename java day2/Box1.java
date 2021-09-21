public class Box1 {
    private int length;
    private int width;
    private int height;

    public Box1()
    {
        System.out.println("Inside the Box: ");
    }
        public int getLength ()
        {
            return length;
        }
        public void setLength ( int length)
        {
            this.length = length;
        }
        public int getWidth ()
        {
            return width;
        }
        public void setWidth ( int width)
        {
            this.width = width;
        }
        public int getHeight ()
        {
            return height;
        }
        public void setHeight ( int height)
        {
            this.height = height;
        }
        public void display () {
            System.out.println("Length=" + length);
            System.out.println("Width=" + width);
            System.out.println("Height" + height);
        }
        public int getvolume ()
        {
            return length * width * height;
        }
    }