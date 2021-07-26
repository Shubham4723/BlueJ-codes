import java.io.*;
public class tot_avg
 {
   public static void main(String args[])
   throws IOException
     {
       int p,ch,b,tot=0;
       double avg = 0.0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.println(" enter marks of phy,chem,bio = ");
       p = Integer.parseInt(br.readLine());
       ch = Integer.parseInt(br.readLine());
       b = Integer.parseInt(br.readLine());
       
       tot = p+ch+b;
       avg = tot/3.0;
         
         System.out.println(" total marks in phy,chem,bio = "+tot);
         System.out.println(" average marks = "+avg);
        }
    }