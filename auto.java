
import java.io.*;
class auto
  {
    public static void main(String args[])
    throws IOException
      {
         int n,r=0,s=0;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.print("enter a no");
          n=Integer.parseInt(br.readLine());
          
          r=n%100;
          s=r*r;
          
          if(s==n)
          System.out.println("it is a autotrophic no");
          
          else
          System.out.println("not autotrophic");
          
      }
      
      
  }
          