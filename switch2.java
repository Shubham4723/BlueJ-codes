import java.io.*;

class switch2
  
{
    
public static void main(String args[])
    
throws IOException
      
{
        
int n;
       
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
System.out.print("enter a no from 1 to 5 =");
        
n=Integer.parseInt(br.readLine());
        
        
switch(n)
         
   {
           
      
           
      case 1:System.out.println("one");
           
      break;
           
          

     
           
     case 2:System.out.println("two");
           
     break;
           
           

      
          
      case 3:System.out.println("three");
           
      break;
           
           
   
     
           
     case 4:System.out.println("four");
            
     break;
           
           

     
           
     case 5:System.out.println("five");
           
     break;
           
           

     
          
              
     
           
           default:System.out.println("you idiot");
           
         
}
      
}
}

           
           
           
        