import java.io.*;
public class diamond
 {
   public static void main(String args[])throws IOException
    {
      int n,i,j,k,u=0,h;   
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   
       System.out.print(" enter no of rows or columns = ");
        n = Integer.parseInt(br.readLine());
          
          for(i=1;i<=n;i++)
           {
              u = 1;
            
             for(j=1;j<=n-i;j++)
              {
                 System.out.print("   ");
                }
                  for(k=n-i+1;k<=n;k++)
                   {
                     System.out.print(" "+u+" ");
                     u++;
                    }
                       u=u-2;
                      for(h=2;h<=i;h++)
                       {
                         System.out.print(" "+u+" ");
                         u--;
                    }
                     
                    System.out.println();
                }
                  //u = u - 2;  
           for(i=1;i<=n-1;i++)
          {
             u = 1;
            for(j=1;j<=i;j++)
             {
               System.out.print("   ");
            }
             for(k=i;k<=n-1;k++)
              {
                System.out.print(" "+u+" ");
                u++;
            }
              u = u - 2;
               for(h=1;h<=n-i-1;h++)
                {
                  System.out.print(" "+u+" ");
                  u--;
                }
                  System.out.println();
                }
                }
            }

                


          