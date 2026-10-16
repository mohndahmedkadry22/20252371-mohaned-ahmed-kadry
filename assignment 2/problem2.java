import java.util.Scanner;
public class Sheet2_Problem2 {  
  public static void main(String[] args) {  
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter year: "); 
    int year = input.nextInt(); 
    // divisible by 4 and not by 100, or divisible by 400  
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {  
      System.out.println("Leap year"); 
    } else { 
      System.out.println("Not a leap year");  
    }  
    input.close();
  } 
}
