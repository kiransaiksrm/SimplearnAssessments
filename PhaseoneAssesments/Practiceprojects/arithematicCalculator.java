package Arithematiccalculatorfinal;
import java.util.*;
public class arithematicCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				double a,b;
				char choice, choice1;
				do
				{
					
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter the first number: ");
					a= sc.nextDouble();
					System.out.println("Enter the second number: ");
					b = sc.nextDouble();
					System.out.println("\n1. Addition \n2. Subtraction \n3. Multiplication \n4. Division \nEnter an operation: ");
					choice= sc.next().charAt(0);

					switch(choice)
					{	
						
						case '1': System.out.println("The sum is:"+ (a + b));
									break;
				
	
						case '2': System.out.println("The difference is: " + (a-b));
							  		break;
				  	 
				
						case '3': System.out.println("The product is: " + (a*b));
									break;
					
						case '4': System.out.println("The remainder is: " + (a/b));
					  		  		break;
					  
						default: System.out.println("Invalid operator !!");
					}
				
					System.out.println("Do you want to continue (y/n):");
					choice1 = sc.next().charAt(0);
				}
				while(choice1== 'y');
				
			}
	}


