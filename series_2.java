import java.io.*;
class series_2
 {
   public static void main(String args[])
   throws IOException
    {
      int a,p;
      double s = 0.0;
      
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      
      System.out.print(" enter a no and power ");
      a = Integer.parseInt(br.readLine());
      p = Integer.parseInt(br.readLine());
      
      int f,y = 0;
      double t = 0.0;
         
         for(int i=1;i<=p;i++)
           {
              f = 1;
                for(int j=1;j<=(i+1);j++)
                  {
                    f = f*j;
                }
                
                
                  y = (int)Math.pow(a,i);
                  t = (double)y/f;
                  s = s + t;
                }
                   System.out.println(s);
                }
            }
                
      
      