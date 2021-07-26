import java.io.*;
public class avh
 {
   public static void main(String args[])
   throws IOException
     {
       int eli,ela,tot=0;
       double avg = 0.0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println(" enter marks in eng lit and eng lang = ");
       eli = Integer.parseInt(br.readLine());
       ela = Integer.parseInt(br.readLine());
       
       tot = eli+ela;
       avg = tot/2.0;
         
         System.out.println(" total marks in english = "+tot);
         System.out.println(" average marks = "+avg);
        }
    }