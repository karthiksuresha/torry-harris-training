public class Demo5 {
    public static void main(String[] args)
    {
        int a=0,b=0;
        int []array={10,20,30,40,50};
        for(int i=0;i<array.length;i++)
        {
            a = a + array[i];
        }
        System.out.println("avg of the array: "+a/2);
        b=(array.length)/2;
        System.out.println("mid value of the array: "+array[b]);
    }
}
