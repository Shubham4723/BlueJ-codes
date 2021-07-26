import java.io.*;
class menu9
 {
    public static void main(String args[])
   throws IOException
       {
           int l,b,h,c;
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           System.out.print(" enter length = ");
           l = Integer.parseInt(br.readLine());
            
            System.out.print(" enter breadth = ");
             b = Integer.parseInt(br.readLine());

             System.out.print(" enter height = ");
              h = Integer.parseInt(br.readLine());
                  
           System.out.println(" press 1 for area and press 2 for volume ");

            System.out.print(" Your choice = ");
             c = Integer.parseInt(br.readLine());
            
           
           
                   if(c==1)
                        area(l,b);
                     
                  else if(c==2)
                         volume(l,b,h);
                     
                   else
                        System.out.println(0);
             }
 //----------------------------------------------------------------------

        public static void area(int l,int b)
              {
                  int a = l*b;
                    System.out.println(" area ");
                     System.out.println( " ------------------- ");
                       System.out.println(a);
                 }
//-----------------------------------------------------------------------

             public static void volume(int l,int b,int h)
                {
                     int v = l*b*h;
                      System.out.println(" volume ");
                     System.out.println( " ------------------- ");
                       System.out.println(v);
                 }
}

  