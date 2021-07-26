import java.io.*;
class perfect
  {
    public static void main(String args[])
    throws IOException
      {
         int n,r=0,s=0,d=0;
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
          System.out.print("enter a no");
          n=Integer.parseInt(br.readLine());
           
          for(int i = 1;i <= n;i++)
            {
              r = n % i;
               if(r==0)
                s = s + i;
                
            }
              d = s - n;
               if(d==n)
                System.out.println(" it is a perfect no ");
               
               else
                 System.out.println(" not a perfect no ");

                 
                }
            }