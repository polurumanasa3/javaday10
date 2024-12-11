class B
{
  int sum(int n)
  {
if(n==0) return 1;
return n*sum(n-1);
  }
    
    public static void main(String args[])
    {
    B ob = new B();
    int res = ob.sum(10);
    System.out.println(res);
    }
}


   