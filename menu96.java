import java.io.*;
class menu96
  {
     public static void main(String args[])
      throws IOException
         {
               int n,c;
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               
                 System.out.print(" enter a no = ");
                  n = Integer.parseInt(br.readLine());

                  System.out.println(" Press 1 sum of 1/4,1/8....upto n and 2 for sum of 1/1!,2/2!......upto n ");
                   
                   System.out.print(" Your choice = ");
                   c = Integer.parseInt(br.readLine());
                  
                      if(c==1)
                            sum_multi_of_4(n);
                       
                      else if(c==2)
                             sum_fact(n);
                        
                          else
                                System.exit(0);
                   }
//---------------------------------------------------------------------------
           public static void sum_multi_of_4(int n)
            {
           
              int y=1;
              double s=0;
               for(int i=4;i<=n;i=i+4)
                {
                   s = s + (y*1.0d/i);
                  
                }
                System.out.println("   "+s);
            }
//-----------------------------------------------------------------------------

           public static void sum_fact(int n)
            {
                
                   int f;
                   double a = 1.0;
                   double q;
                   double su = 0.0d;
                    for(int i=1;i<=n;i++)
                        {
                          f=1;
                          for(int j=1;j<=i;j++)
                           {
                             f = f*j;
                            }
                            q = (double)i/f;
                             su = su + q;
                             
                              
                               
                              System.out.println();
                     }
                     System.out.print("   "+su);
                    }
                }
    
            