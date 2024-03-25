package fitness;
import java.util.*;
public class Main {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("--------WELCOME--------");
details();
	}static int usid=-1;
	public static void details() {
		System.out.println("Enter 1 for create account");
		System.out.println("Enter 2 for login account");
		System.out.print("Enter your choice =");
		int choice=sc.nextInt();
		user us=new user();
		if(choice==1) {
		usid++;
		System.out.print("Enter your user_name =" );
		String username=sc.next();
		System.out.println();
		System.out.print("Enter your user_password =" );
		String pass=sc.next();
		System.out.println();
		System.out.print("Enter your height(m) =" );
		double height=sc.nextDouble();
		System.out.println();
		System.out.print("Enter your weight(kg) =" );
		int weight=sc.nextInt();
		System.out.println();
		System.out.print("Enter your Age =" );
		int age=sc.nextInt();
		System.out.println();	
		us.input(usid,username,pass,height,weight,age);
		details();
		
	}else if(choice==2) {
		us.login(usid);
		details();
	}
	}

}
