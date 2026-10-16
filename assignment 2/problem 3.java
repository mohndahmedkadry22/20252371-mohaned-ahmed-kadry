import java.util.Scanner;
public class Sheet2_Problem3 { 
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);  
    System.out.print("Enter first number: ");  
    double num1 = input.nextDouble();  
    System.out.print("Enter operator: ");  
    char op = input.next().charAt(0);
    System.out.print("Enter second number: "); 
    double num2 = input.nextDouble();  
    double result = 0;  
    boolean valid = true; 
    switch (op) {  
      case '+': 
        result = num1 + num2;  
        break;     
      case '-':
        result = num1 - num2;  
        break; 
      case '*':  
        result = num1 * num2;  
        break; 
      case '/': 
        if (num2 == 0) { 
          System.out.println("Error: cannot divide by zero"); 
          valid = false;   
        } else {    
          result = num1 / num2;  
        }    
        break;   
      default: 
        System.out.println("Invalid operator");  
        valid = false;
    }   
    if (valid) {  
      System.out.println("Result: " + result); 
    }    
    input.close(); 
  } 
}
