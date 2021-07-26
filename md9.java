import java.io.*;

class md9
{
  public static void main(String args[]) throws IOException

   {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      System.out.print("Eneter a No = ");
      int n = Integer.parseInt(br.readLine());

     System.out.println("Menu Driven Program");
     System.out.println("---------------------");

     System.out.println("Enter 1 --> Factors,   2 --> Prime Factors,    Otherwise --> Exit");
     System.out.print("Choice = ");
     int v = Integer.parseInt(br.readLine());
     System.out.println();

    if(v==1)
       factor(n);
   
   else 
     if(v==2)
         prime_fact(n);
      
   
   else
      System.exit(n);
    
     }			//main() ends

 //-------------------------------------------------------------------

 public static void factor(int k)
{
   System.out.println("The Factors are ");
   System.out.println("--------------------");
  for(int i=1;i<=k;i++)
           {
               int r = k%i;
               if(r==0)
                System.out.print(" " + i);
            }
  }			//factor(int k) ends
//----------------------------------------------------------

  public static void prime_fact(int p)
   {
          int k=2;
          int q = p;
            System.out.println("The Prime Factors are ");
           System.out.println("--------------------");
        for(int i=1;i<=q;i++)
           {
               int r = p%k;
               if(r==0)
                {
                   p = p/k;
                  System.out.print(" " + k);
                }
               else
                 k++;
            }
         }			//prime_fact(int p) ends					
   //--------------------------------------------------------------------------

  } 			//class ends
