import java.io.*;
public class discount
 {
   public static void main(String args[])
   throws IOException
     {
       int a;
       double d = 0.0,f = 0.0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println(" enter tot amt = ");
       a = Integer.parseInt(br.readLine());
        if(a<=2000)
         {
           d = (a*5)/100.0;
           f = a - d;
        }
         else
           if(a>2000 && a<=5000)
             {
               d = (a*25)/100.0;
               f = a - d;
            }
         else
            if(a>5000 && a<=10000)
              {
               d = (a*35)/100.0;
               f = a - d;
            }
          else
             {
               d = (a*50)/100.0;
               f = a - d;
            }
                   
         System.out.println(" final amt to be paid = "+f);
         }
    }