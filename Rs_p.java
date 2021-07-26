class Rs_p
 {
   public static void main(String args[])
     {
       int a,b,c,d,s1,s2,s3,s4;
             
       a = 8;
       b = 75;
       c = 5;
       d = 50;
       s1 = a+c;
       s2 = b+d;
        if(s2>=100)
          {
            int r = s2%100;
            int y = (int)s2/100;
             s3 = s1+y;
             s4 = r;
        }
           else
            {
              s3 = s1;
              s4 = s2;
            }
            System.out.println(a+"Rs"+" "+" "+b+"p");
            System.out.println(c+"Rs"+" "+" "+d+"p");
            System.out.println("+");
            System.out.println("-------------------");
            System.out.println(s3+"Rs"+" "+" "+s4+"p");
            
        }
    }
          