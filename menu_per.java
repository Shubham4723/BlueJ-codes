import java.io.*;
class menu_per
 {
   public static void main(String args[])
   throws IOException
     {
       int n,m;
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
        System.out.print(" enter starting point = ");
        n = Integer.parseInt(br.readLine());
        
        System.out.print(" enter ending point = ");
        m = Integer.parseInt(br.readLine());
        
          perfects(n,m);
        }
  //--------------------------------------
    public static void perfects(int n,int m)
       {
           double a=0.0d; int b=0,s=0;
           for(int i=n;i<=m;i++)
             {
               a = Math.pow(i,0.5);
               b = (int)a;
               
               s = b*b;

               if(s==i)
                 
                 System.out.println(i);
                  
                
                  
               }
               
           }
}
               