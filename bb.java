class bb
 {
   public static void main(String  args[])
       {
         int a=0,b=0,r=0,g=0;
         for(int i=2;i<=5;i++)
          {
            a =(int)Math.pow(i,2);
            b = (int)Math.pow(i,3);
            
            r = a%2;
            
            if(r!=0)
              {
                g = a*(-1);
                
                }
                
             else
               g = a;
               
               System.out.print(g+"/"+b+"  ");
               
               }
            }
          }
               
                