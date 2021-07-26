import java.io.*;
public class abc
 {
   public static void main(String args[])
   throws IOException
     {
       int l,b,a=0,p=0;
       double d = 0.0;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print(" enter length and breadth = ");
       l = Integer.parseInt(br.readLine());
       b = Integer.parseInt(br.readLine());
       
       a = l*b;
       p = 2*(l+b);
       
       d = Math.pow((Math.pow(l,2)+Math.pow(b,2)),0.5);
       
       System.out.println(" Area = "+a);
       System.out.println(" Perimeter = "+p);
       System.out.println(" Diagonal = "+d);
       
    }
}
         

    