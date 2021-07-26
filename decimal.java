import java.io.*;
class decimal
 {
   public static void main(String args[])
   throws IOException
     {
       double d;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       System.out.print(" enter a decimal no = ");
       d = Double.parseDouble(br.readLine());
       
       deci(d);
       
    }
    
    public static void deci(double d)
     {
       int n = (int)Math.pow(10,3);
       double m = d*n;
       
       int g = (int)m;
       
       int r = g%n;
       int k = g/n;
       
       int h = r%10;
        
       int y = r%100;
       int e = r/100;
       
       int u = y%10;
       int q = y/10;
       
       if(h>=5)
         q++;
         
       else
         q = q+0;
         
       System.out.print(k+"."+e+q);
    }
}
     
         
        
          
     
       
       
       
       