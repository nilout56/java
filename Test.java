import java.util.Scanner;

public class Test{
public static void main(String[] arg){
	int number1,number2,number3,sum,result;
	Scanner scan = new Scanner(System.in);
 System.out.println("Enter Your Number1: ");
 number1 = scan.nextInt();
 
 System.out.println("Enter Your Number2: ");
 number2 = scan.nextInt();
 
 System.out.println("Enter Your Number3: ");
 number3 = scan.nextInt();
 
 scan.close();
 
 sum = number1>number2? number1:number2;
 result = sum>number3? sum:number3;
 System.out.println(" The largest number is:" + result);
 
	//   for(int i = 0; i<5; i++){
	//   System.out.println(i);
	//   }
 }
}