import java.io.*;
class series_1
 {
   public static void main(String args[])
   throws IOException
    {
      int a,n;
      double s = 0.0;
      
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      
      System.out.print(" enter a no and power ");
      a = Integer.parseInt(br.readLine());
      n = Integer.parseInt(br.readLine());
      
      int y = 0,k = 2;
      double z = 0.0;
         
         for(int i=1;i<=n;i+=2)
           {
             if(i>n)
               break;
              int f = 1;
                for(int j=1;j<=k;j++)
                  {
                    f = f*j;
                }
                
                k+=2;
                  y = (int)Math.pow(a,i);
                  z = (double)y/f;
                  s = s + z;
                }
                   s =  1 + s;
                   System.out.println(s);
                }
            }
                
      
      