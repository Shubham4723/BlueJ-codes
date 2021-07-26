import java.io.*;
class fff
  {
    public static void main(String args[])
    throws IOException
       {
         char ch;
       
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
         System.out.println(" Car Dealership ");
         
         System.out.println(" Press 'H' for Hatchback 'S' for sUV 'N' for sedan and 'T' for truck ");
         System.out.print(" Enter your choice = ");
         ch = (char)br.read();
         
         if(ch=='H')
          {
              System.out.println(" Brand = Honda ");
              System.out.println(" Model = Civic ");
              System.out.println(" Year = 2010 ");
              System.out.println(" Miles = 20000 ");
              System.out.println(" Price = 1200000 ");
              
              System.out.println();
              
              System.out.println(" Brand = Toyota ");
              System.out.println(" Model = Prius ");
              System.out.println(" Year = 2015 ");
              System.out.println(" Miles = 19000 ");
              System.out.println(" Price = 1300000 ");
              
              System.out.println();
              
              System.out.println(" Brand = Volkswagen ");
              System.out.println(" Model = Golf ");
              System.out.println(" Year = 2008 ");
              System.out.println(" Miles = 17000");
              System.out.println(" Price = 800000 ");
              
            }
            
          else if(ch=='N')
           {
              System.out.println(" Brand = Hyundai ");
              System.out.println(" Model = Accent ");
              System.out.println(" Year = 2004 ");
              System.out.println(" Miles = 50000 ");
              System.out.println(" Price = 2700000 ");
              
              System.out.println();
              
              System.out.println(" Brand = Chevrolet ");
              System.out.println(" Model = Cruze ");
              System.out.println(" Year = 2012 ");
              System.out.println(" Miles = 49500 ");
              System.out.println(" Price = 2800000 ");
              
              System.out.println();
              
              System.out.println(" Brand = Toyota ");
              System.out.println(" Model = Corolla ");
              System.out.println(" Year = 2015 ");
              System.out.println(" Miles = 65000 ");
              System.out.println(" Price = 2560000 ");
            }
            
          else if(ch=='S')
           {
               System.out.println(" Brand = Ford ");
               System.out.println(" Model = Ecosport ");
               System.out.println(" Year = 2016 ");
               System.out.println(" Miles = 10000 ");
               System.out.println(" Price = 3300000 ");
               
               System.out.println();
               
               System.out.println(" Brand = Renault ");
               System.out.println(" Model = Duster ");
               System.out.println(" Year = 2013 ");
               System.out.println(" Miles = 11000 ");
               System.out.println(" Price = 3700000 ");
               
               System.out.println();
               
               System.out.println(" Brand = Mahindra ");
               System.out.println(" Model = scorpio ");
               System.out.println(" Year = 2007 ");
               System.out.println(" Miles = 15000 ");
               System.out.println(" Price = 3500000 ");
               
            }
            
         else if(ch=='T')
          {
               System.out.println(" Brand = Tata ");
               System.out.println(" Model = Xenon XT ");
               System.out.println(" Year = 2016 ");
               System.out.println(" Miles = 100000 ");
               System.out.println(" Price = 4000000 ");
               
               System.out.println();
               
               System.out.println(" Brand = Mahindra ");
               System.out.println(" Model = Imperio ");
               System.out.println(" Year = 2014 ");
               System.out.println(" Miles = 135000 ");
               System.out.println(" Price = 3950000 ");
               
               System.out.println();
               
               System.out.println(" Brand = Isuzu ");
               System.out.println(" Model = D-Max ");
               System.out.println(" Year = 2015 ");
               System.out.println(" Miles = 122000 ");
               System.out.println(" Price = 4000000 ");
               
            }
            
         else
          System.out.println(" Your Choice Did Not Match ");
          
          
        }
    }
        
               
          
              
                    
         
         