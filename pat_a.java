import java.io.*;
public class pat_a
 {
   public static void main(String args[])throws IOException
    {
      int n,i,j;
      BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print(" enter no of rows or columns = ");
      n=Integer.parseInt(obj.readLine());
      
      for(i=1;i<=n;i++)
       {
         int u = i;
          for(j=1;j<=i;j++)
           {
             
             System.out.print(" "+u+" ");
             u--;
            }
            
          
          System.out.println();
        }
    }
}
      