package lab3;

public class zad2 {
    public static void main(String[] args){
      int n = 2, x=2, i=0;
      int[] a = new int[]
        {
            0,1,2,3,4
        };
      while(i<=n)
      {
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
