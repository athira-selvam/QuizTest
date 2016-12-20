import java.io.*;
import java.util.*;
import pack.*;

interface UserLogin{
  
  public void login ();
}

class Exam{
  public static void main(String[] args) throws FileNotFoundException,IOException{
    System.out.println("Login as:");
        System.out.println("1.Student");
        System.out.println("2.Faculty");
        Scanner s = new Scanner(System.in);
        int ca = s.nextInt();
        if(ca == 1){
            Student st = new Student();
            st.login();
            
            
            
          }
        else{
            Faculty f = new Faculty();
            f.login();   
        }    
  }
}
 
