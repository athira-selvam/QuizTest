import java.io.*;
import java.util.*;

public class Questions extends CalcResult{
      String qtype,n; //mcsa or mcma or torf or fib 
        int m=0,k;
  public int test(String us) throws FileNotFoundException,IOException{            
        new Reminder(100);
        System.out.println("Task scheduled.");
  
        
        int marks=0;
        BufferedReader br1 = new BufferedReader(new FileReader("a.txt"));
         BufferedReader br2 = new BufferedReader(new FileReader("qtypes.txt"));
    try (BufferedReader br = new BufferedReader(new FileReader("q.txt")))
    {

      String sCurrentLine;
      Scanner reader = new Scanner(System.in); 
      Scanner s = new Scanner(System.in); 
      
      int i=0,flag=0;
      
      while ((sCurrentLine = br.readLine()) != null ) {
            
        
        System.out.println(sCurrentLine);
        i++;
        if(i==5){
          qtype = br2.readLine();
          if(qtype.equals("mcsa"))
           { System.out.println("select one answer");
              m=1;
            n =s.nextLine();
           String ans = br1.readLine();
          if(n.equals(ans)){
                System.out.println("The correct answer");
                  marks=marks+m;
              }
              
              else{
                System.out.println("The wrong answer");
              }
       }



          if(qtype.equals("fitb"))
          {
            System.out.println("type the answer");
            m=1;
            String n =s.nextLine();
          String ans = br1.readLine();
          if(n.equals(ans)){
                System.out.println("The correct answer");
                  marks=marks+m;
              }
              
              else{
                System.out.println("The wrong answer");
              }
          }




          if(qtype.equals("torf"))
          {
            
            System.out.println("answer yes or no");
            m=1;
            String n =s.nextLine();
          String ans = br1.readLine();
          if(n.equals(ans)){
                System.out.println("The correct answer");
                  marks=marks+m;
              }
              
              else{
                System.out.println("The wrong answer");
              }
          }





          if(qtype.equals("mcma"))
          {int t,noa;
            String ca;
            t=0;
            System.out.println("select more than one answer");
            System.out.println("No of answers:");
             noa=s.nextInt();
             String inp=null;
        inp =br1.readLine();
        String[] ele;
         ele = inp.split(",");
          ca=s.nextLine();
            for(int j=0;j<noa;j++)
            { 

               ca=s.nextLine();   
            
        
       
         
        if( ca.equals(ele[j]))
            {    t++;}
           

          }
          
            if(t==noa)
            {
              m=2;
              System.out.println("The correct answer");
                  marks=marks+m;
            }

            else{
                System.out.println("The wrong answer");
              }

            }



           i=0;
          
          
        }
        

      }
      
    }  




    System.out.println("Score: " + marks);
    calculate(marks,us);

    return marks;
    
  }
       
    }  

    

   






















