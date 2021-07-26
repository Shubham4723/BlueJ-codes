public class paris
 {
   public void abc(int a)
    {
      int c = 0,r = 0;                                
      
      for(int i=a;i>0;i/=10)
        c++;
        String str = "";
        
      for(int i=1;i<=c;i++)
       {
         r = a%10;
         a = a/10;
         int x = r;
         int y = (int)Math.pow(10,i-1);
         
           if(i==c)
             str = x+"*"+y+str;
             
           else
              str = "+"+x+"*"+y+str;
              
              if(a==0)
               break;
            }
            
                  System.out.println(str);
                  
                }
            }
              
              
         