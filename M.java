import java.util.*;
class  p{
    int c;
    String b;
    p(int c,String b)
    {
    this.c=c;
    this.b=b;
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
 class M{
    public static void main(String args[])
    {
        p s=new p(678,"jakeel");
        s.display();
    }

    }

    