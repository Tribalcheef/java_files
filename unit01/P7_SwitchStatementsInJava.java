package Unit_01;



import java.util.Scanner;

public class P7_SwitchStatement {

	public static void main(String[] args) {

		SwitchStatements obj = new SwitchStatements();
		obj.switchStatements();

	}

}

class SwitchStatements {
	void switchStatements() {
		
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter your choice: ");
		
		int Choice = obj1.nextInt();
		
		switch(Choice) {
		case 1: {
			if(Choice == 1) {
				System.out.println("2022");
			}
			break;
		}
		
		case 2: {
			if (Choice == 2) {
				System.out.println("April");
			}
			break;
		}
		
		case 3: {
			if (Choice == 3) {
				System.out.println("Saturday");
			}
			break;
		}
		
		default: {
			System.out.println("Invalid Choice");
		}
		    break;
		    
		}
	}

}