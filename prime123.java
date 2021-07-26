import java.io.*;
class prime123   
  { 
     public static void main(String args[]) 
     throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
               System.out.print("enter lower limit =");
                int a = Integer.parseInt(br.readLine());

                 System.out.print("enter upper limit = ");
                  int b = Integer.parseInt(br.readLine());

                   int c,r;
                    int d,y=1;

                          for(int i=a;i<=b;i++)
                             {
                                    c=0;
                                      for(int j=1;j<=i;j++)
                                         {
                                              r = i%j;
                          
                                                 if(r==0)
                                                       c++;
                              }
                                  
                                      if(c==2)
                                         {
                                             System.out.print(" "+i);

                                                d=i-y;
                                               if(d==2)
                                                  System.out.print("("+y+","+i+")");
                                                     y=i;

                                  }
                          }
                 }
      }