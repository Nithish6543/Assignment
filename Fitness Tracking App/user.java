package fitness;
import java.util.*;
import java.util.ArrayList;
public class user {
	static Scanner sc=new Scanner(System.in);
protected static ArrayList<Integer> user_id=new ArrayList<>();
protected static ArrayList<String> user_name=new ArrayList<>();
protected static ArrayList<String> user_password=new ArrayList<>();
protected static ArrayList<Double> height=new ArrayList<>();
protected static ArrayList<Integer> weight=new ArrayList<>();
protected static ArrayList<Integer> age=new ArrayList<>();
protected static ArrayList<ArrayList<String>> ar=new ArrayList<ArrayList<String>>();
protected static ArrayList<Integer> running=new ArrayList<>();
protected static ArrayList<Integer> walking=new ArrayList<>();
protected static ArrayList<Integer> cycling=new ArrayList<>();
protected static ArrayList<Integer> swimming=new ArrayList<>();
protected static ArrayList<Integer> distances=new ArrayList<>();
protected static ArrayList<Integer> caloriesburned=new ArrayList<>();
protected static ArrayList<ArrayList<Integer>> friendrequest=new ArrayList<ArrayList<Integer>>();
//protected static ArrayList<ArrayList<Object>>ar=new ArrayList<new ArrayLi<object>>();

public void input(int usid,String usname,String pass,Double heig,int weigh,int ag) {
	user_id.add(usid);
	user_name.add(usname);
	user_password.add(pass);
	height.add(heig);
	weight.add(weigh);
	age.add(ag);
	running.add(0);
	walking.add(0);
	cycling.add(0);
	swimming.add(0);
	distances.add(0);
	caloriesburned.add(0);
	ArrayList<Integer> dis=new ArrayList<>();
	dis.add(0);
	friendrequest.add(dis);
	//int us=Integer.parseInt(usid);
	//ar.add("demo");
	System.out.println("Account created succesfully");
	System.out.println("Enter 1 to login your account ");
	System.out.println("Enter 2 to view your account ");
	System.out.print("Enter your choice =");
	int choice=sc.nextInt();
	if(choice==1) {
		login(usid);
	}else if(choice==2) {
	view(usid);
	}
}
public  void login(int usid) {
	System.out.println("Welcome to login");
	System.out.print("Enter your user_name =");
	String usname=sc.next();
	String pass="";
	System.out.print("Enter your password (forget password enter 1 to reset or else to continue login enter any number to continue =");
	int choice=sc.nextInt();
	if(choice==1) {
		forgetpass();
		System.out.println();
	}
	else {
		System.out.print("enter your password =");
		pass=sc.next();
		System.out.println();
		}

	for(int i=0;i<user_id.size();i++) {
		if(user_id.get(i)==usid) {
			if(pass.equals(user_password.get(i))){
			choos(usid);
			}else {
				System.err.println("Invalid password");
			}

		}
		}
}
	public  void choos(int usid) {
	workoutplan wrk=new workoutplan();
			System.out.println("Enter 1 to workoutplan");
			System.out.println("Enter 2 to Goals and achievements");
			System.out.println("Enter 3 to Socialfeature");
			System.out.println("enter 4 to exit");
			System.out.print("Enter your choice= ");
			int cho=sc.nextInt();
			if(cho==1) {
			wrk.plan(usid);
			choos(usid);
			}else if(cho==2) {
				Goal g=new Goal();
				g.achievements(usid);
				choos(usid);
				}
			else if(cho==3) {
				socialfeauture sf=new socialfeauture();
				sf.feauture(usid);
				choos(usid);
			}
			else {
				System.out.println("You are redirected to main menu");
			}
			
			}
			

public void view(int usid) {
	System.out.print("Enter your user_name =");
   String  usname=sc.next();
	System.out.print("Enter your user_pass =");
	String pass=sc.next();
	for(int i=0;i<user_id.size();i++) {
		if(usid==user_id.get(i)&&pass.equals(user_password.get(i))) {
			System.out.println("Your user_name ="+user_name.get(i));
			System.out.println("Your height ="+height.get(i));
			System.out.println("your weight ="+weight.get(i));
			System.out.println("your age ="+age.get(i));	
		}
	}
	}
public static void forgetpass() {
	System.out.print("Enter your user_name =");
	String usname=sc.next();
	String pass;
	for(int i=0;i<user_name.size();i++) {
		if(usname.equals(user_name.get(i))) {
			System.out.print("Enter your new password =");
			 pass=sc.next();
			user_password.set(i, pass);
			System.out.println();
		}
	}
}

}
