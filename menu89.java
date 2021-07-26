import java.io.*;
class menu89
  {
     public static void main(String args[])
      throws IOException
         {
               int n,c;
               BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
               
                 System.out.print(" enter a no = ");
                  n = Integer.parseInt(br.readLine());

                  System.out.println(" Press 1 for factorial and 2 for sum of all even nos upto n ");
                   
                   System.out.print(" Your choice = ");
                   c = Integer.parseInt(br.readLine());
                  
                      if(c==1)
                            factorial(n);
                       
                      else if(c==2)
                             sum_even(n);
                        
                          else
                                System.exit(0);
                   }
//-------------------------------------------------------------------------------------------
 
          public static void factorial(int n)
              {
                   int f;
                    for(int i=1;i<=n;i++)
                        {
                          f=1;
                          for(int j=1;j<=i;j++)
                           {
                             f = f*j;
                            }  
                               System.out.print("   "+f);
                              System.out.println();
                     }
    }
//---------------------------------------------------------------------------------------------
         
           public static void sum_even(int n)
              {
                  int s = 0;
                   for(int i=1;i<=n;i++)
                      {
                           int r = i % 2;
                             if(r==0)
                                  s=s+i;
                                   
                        }
                                System.out.println("   "+s);
                 }   
            }   

