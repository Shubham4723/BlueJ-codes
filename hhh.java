import java.io.*;
class hhh
  {
    public static void main(String args[])
    throws IOException
      {
         int n;
         int r,m,a,b,s;
         r=a=b=s=0;
         
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.print(" Enter a no = ");
         n = Integer.parseInt(br.readLine());
         m=n;
          for(int i=1;i<=m;i++)
            {
              r = n % 10;
              s = s + r;
              n = n / 10;
              
               if(n==0)
                break;
                
             }
             
           if(s%2==0)
            {
              a = m - 1;
              System.out.println(" the previous no = "+a);
            }
            
           else
             {
               b = m + 1;
               System.out.println(" the next no = "+b);
             }
            
          }
          
        }
         
         
         
         
         
         
         
         
         