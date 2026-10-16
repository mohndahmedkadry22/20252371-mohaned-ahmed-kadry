public class Sheet1_Problem1 {  
public static void main(String[] args) { 
Scanner input = new Scanner(System.in); 
System.out.print("Enter radius: ");      
double r = input.nextDouble();  
double area = Math.PI * Math.pow(r, 2);  
double circumference = 2 * Math.PI * r;  
System.out.printf("Area = %.2f%n", area);   
System.out.printf("Circumference = %.2f%n", circumference);  
input.close();  
   }
} 
