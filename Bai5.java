package BT5;
import java.util.Scanner;
public class Bai5 {
	public static void main(String[] args) {
	    int sum = 0, number;
	    Scanner scanner = new Scanner(System.in);
	         
	    do {
	        System.out.println("Nhap vao so:");
	        number = scanner.nextInt();
	        sum += number;
	        
	        if (sum > 100)
	            break;
	    } while (number > 0);
	         
	    System.out.println("Tong = " + sum);
}
}