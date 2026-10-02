import java.util.*;

public class Methods{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
      
        int ValueOne = scan.nextInt();
        int ValueTwo = scan.nextInt();
      
        int result = Sum(ValueOne,ValueTwo);

        boolean IsEven = Check(result);

        if(IsEven == true){
            System.out.println("Evem")
        }
        else{
            System.out.println("ODD");
        }
      
    }
  
    public static int Sum(int one,int two)
        return one + two;
    }
    public static boolean Check(int Three){
      if(three%2 == 0){
        return true;
      }
      else{
        return false;
      }
    }
}
