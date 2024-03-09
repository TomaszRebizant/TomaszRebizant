package lab3;

public class zad1 {
   public static void main(String[] args){
       int N = 10000,K=12;
       while(K<N){
           int L = 2, Z=0;
           while(L<(K/2))
           {
              if (K%L!=0){
                   L+=1;
           }
              else {
                Z=1;
                  break;
              }
           }
           if(Z==0){
               System.out.println(K);
               System.exit(0);
           }
           else K+=1;
       }
       System.exit(0);
   }


}
