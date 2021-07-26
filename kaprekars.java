import java.io.*;
public class kaprekars
 {
   public static void main(String args[])throws IOException
    {
      int n,m;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print(" enter starting point = ");
      n = Integer.parseInt(br.readLine());
      
      System.out.print(" enter finishing point = ");
      m = Integer.parseInt(br.readLine());
      int z,c,sq,lt,rt,tot,y;
      
      System.out.println("List of Kaprekar's Nos.");
      System.out.println("-----------------------");
      
      for(int i=n;i<=m;i++)
       {
          c=0;
          z = i;
         for(int j=i;j>=1;j=j/10)
           c++;
          //System.out.println("No of digits = " + c);
          
          sq = z*z;
          y = (int)Math.pow(10,c);
          rt = sq%y;
          lt = (int)sq/y;
          tot  = lt + rt;
          
          
           if(tot==z)
             System.out.print(" " + z);
             }
             
          }
       }