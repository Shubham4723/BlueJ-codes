import java.io.*;
public class valley
 {
   public static void main(String args[])throws IOException
    {
      int n,i,j,k,h;   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       System.out.print(" enter no of rows or columns = ");
        n = Integer.parseInt(br.readLine());
        
         for(i=1;i<=n;i++)
          {
             int g = 1;
            for(j=2;j<=i;j++)
             {
               System.out.print("   ");
            }
             for(k=i;k<=n;k++)
              {
                System.out.print(" "+g+" ");
                g++;
            }
              g = g - 2;
               for(h=2;h<=n-i+1;h++)
                {
                  System.out.print(" "+g+" ");
                  g--;
                }
                  System.out.println();
                }
            }
        }

                  
                 
              
        
   
          