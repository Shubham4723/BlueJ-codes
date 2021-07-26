import java.io.*;

public class binary_1 extends binary_4 
 {
   public static void main(String args[])throws IOException
    {
      int i,j,k,l;
      l=1;
      BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));

      System.out.print("enter no of columns or rows=");
      int n=Integer.parseInt(obj.readLine());
      
      for(i=1;i<=n;i++)
      {
      l=1;
          for(j=1;j<=i;j++)
          {
          if(j%2!=0)
          {
          System.out.print(" "+l+" ");
              l--;
              }
              else
              {
              System.out.print(" "+l+" ");
              l++;
              }
            }
            
           System.out.println();
        }
        
    }
}
              
              