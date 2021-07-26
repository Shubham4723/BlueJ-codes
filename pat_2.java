import java.io.*;
public class pat_2
 {
   public static void main(String args[])throws IOException
    {
      int n,i,j,k,h;   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       System.out.print(" enter no of rows or columns = ");
        n = Integer.parseInt(br.readLine());
          
          for(i=1;i<=n;i++)
           {
             int u = 1;
             int y = 2;
             for(j=1;j<=n-i;j++)
              {
                 System.out.print(" ");
                }
                  for(k=n-i+1;k<=n;k++)
                   {
                     System.out.print(u);
                     u++;
                    }
                   for(h=n-i;h<=n;h++)
                    {
                     System.out.print(y);
                        y--;
                    }
                    System.out.println();
                }
                
            }
        }
          