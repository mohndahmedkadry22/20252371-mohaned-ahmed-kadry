import java.util.Scanner;
public class Sheet1_Problem3 { 
public static void main(String[] args) {
Scanner input = new Scanner(System.in); 
System.out.print("Enter three scores: ");  
int s1 = input.nextInt(); 
int s2 = input.nextInt();   
int s3 = input.nextInt();  
// divide by 3.0 so we don't lose the decimal part 
double average = (s1 + s2 + s3) / 3.0; 
System.out.println(Math.round(average));   
System.out.printf("%.2f%n", average);   
input.close();  
 } 
}
