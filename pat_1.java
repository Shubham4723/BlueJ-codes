import java.io.*;
public class pat_1
 {
   public static void main(String args[])throws IOException
    {
      int n,i,j,k;   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       System.out.print(" enter no of rows or columns = ");
        n = Integer.parseInt(br.readLine());
         int u = 1;
         for(i=1;i<=n;i++)
          {
           for(j=1;j<=i;j++)
             {
              System.out.print("  ");
               
            }
              for(k=i;k<=n;k++)
                {
                  System.out.print(u);
                  u++;
                }
                  u = u -(i - 1);
                  System.out.println();
              
            }
            
        }
        
    }
           