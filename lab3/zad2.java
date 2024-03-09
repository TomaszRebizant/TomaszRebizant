package lab3;

public class zad2 {
    public static void main(String[] args){
      int n = 2, x=2, i=0;
      int[] a = new int[]
        {
            5,4,3,2,1
        };
      while(i<=n)
      {
          a[i]=
          i+=1;
      }
      i=n-1;
      int y = a[n];
      while(i>=0)
      {
          y=y*x+a[i];
          i-=1;
      }
        System.out.println(y);
      System.exit(0);
    }

}
