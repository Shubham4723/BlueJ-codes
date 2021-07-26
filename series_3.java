import java.io.*;
class series_3
  {
    public static void main(String args[])
    throws IOException
     {
       int a,p;
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
       System.out.print("enter a no & its power =");
       a = Integer.parseInt(br.readLine());
       p = Integer.parseInt(br.readLine());
       
       int f,y=0,t=0;
       double u=0.0,s=0.0;
        for(int i=1;i<=p;i+=2)
         {
          f = 1;
          y = i++;
            for(int j=1;j<=i;j++)
             {
               f = f * y;
               t = (int)Math.pow(a,i);
               u = (double)t/f;
               
               s = s+u;
               
            }
        }
        
        System.out.println(s);
        
    }
}
           