import java.io.*;
public class fah_cen
 {
   public static void main(String args[])
   throws IOException
     {
       int f;
       double c = 0.0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println(" enter temperature in fahrenheit = ");
       f = Integer.parseInt(br.readLine());
       c = (5*(f-32))/9.0;
       System.out.println(" tempurature in degree celsius = "+c);
        }
    }