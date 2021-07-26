import java.io.*;
class menu_pal
  { 
    public static void main(String args[])
    throws IOException
      {
        int n,c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print(" enter a no = ");
        n = Integer.parseInt(br.readLine());
        
        System.out.println(" press 1 for palindrome press 2 for palprime press 3 for buzz no ");
        
        System.out.print(" Choice = ");
        c = Integer.parseInt(br.readLine());
        
        if(c==1)
          pali(n);
          
        else
          if(c==2)
            pal(n);
         
        else
          if(c==3)
             buzz(n);
             
        else
           System.exit(0);
        }
        
    //---------------------------------------------------------
      public static void pali(int n)
        {
          int r=0,rev=0,m=n;
          boolean a = true;
          boolean b = false;
            for(int i=1;i<=m;i++)
              {
                 r = n%10;
                 rev = rev*10+r;
                 n = (int)n/10;
                 
                 if(n==0)
                   break;
                 
              }
                 System.out.println(" palindrome = "+rev);
                 if(rev==m)
                  {
                    
                    System.out.println(a);
                 }
                  
                  else 
                    {
                      
                      System.out.println(b);
                    }
             }
          
     //------------------------------------------------
       
        public static void pal(int n)
         {
           int r=0,rev=0,m=n;
            boolean a = true;
            boolean b = false;
            for(int i=1;i<=m;i++)
              {
                 r = n%10;
                 rev = rev*10+r;
                 n = (int)n/10;
                 
                 if(n==0)
                   break;
                 
               
             }
                System.out.println(" palindrome = "+rev);
                int re=0,c=0;
                for(int i=1;i<=rev;i++)
                 {
                   re = rev % i;
                    
                    if(re==0)
                     c++;
                     
                     if(c==2)
                       break;
                   }
                   
                if(rev==m && c==2)
                 {
                  
                   System.out.println(a);
                 }
                 
               else
                {
                  
                  System.out.println(b);
                }
           }
           
   //--------------------------------------------------------------
    
     public static void buzz(int n)
       {
         boolean b = false;
         boolean a = true;
         int r=0,re=0;
          for(int i=1;i<=n;i++)
           {
             r = n % 7;
             re = n % 10;
             
             }
             
             if(r==0 || re==7)
              {
                
                System.out.println(a);
              }
              
            else
              {
                
                System.out.println(b);
              }
          }
       }
      //-----------------------------------------------
               
             
             
            
                    
          