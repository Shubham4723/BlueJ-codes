import java.io.*;
class mul
  {
    public static void main(String args[])
    throws IOException
      {
         int n,m;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.print("enter a no");
          n=Integer.parseInt(br.readLine());
          
          for(int i=1;i<=12;i++)
            { 
              m=n*i;
              System.out.println(n+"*"+i+"="+m);
              
            }
            
        }
}
         
         

              
          
          