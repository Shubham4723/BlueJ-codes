import java.io.*;
class buzz
  {
    public static void main(String args[])
    throws IOException
      {
         int n,r=0;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.print("enter a no");
          n=Integer.parseInt(br.readLine());
          
          r=n%10;
          if(r==7 || n%7==0)
          System.out.println("it is a buzz no");
          
          else
          System.out.println("not buzz");
          
       }
       
    }
      
     