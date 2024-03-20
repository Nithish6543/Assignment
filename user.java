
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
class user{
	ArrayList<String> user_id=new ArrayList<>();
	 ArrayList<String> user_name=new ArrayList<>();
	ArrayList<String> user_email=new ArrayList<>();
	 ArrayList<String> password=new ArrayList<>();
	 Scanner sc=new Scanner(System.in);
	int count;
	 public void input(int cou,String id,String name,String email,String pass) {
		 
		 user_id.add(id);
		 user_name.add(name);
		 user_name.add(email);
		 password.add(pass);
		 System.out.println(" profile Created succesfully");
		 count=cou;
	 }
	 public void display() {
		 int len=user_id.size();
		 for(int i=0;i<len;i++) {
			 System.out.print(user_id.get(i));
			 System.out.print(user_name.get(i));
			 System.out.print(user_email.get(i));
		 }
	 }
	 public String userid() {
		 return user_id.get(count);
	 }
	 public String username() {
		 return user_name.get(count);
	 }public int planid() {
		 System.out.println("Enter your plan id =");
		 int i=sc.nextInt();
		 return i;
	 }
}
class feedback{
	Scanner sc=new Scanner(System.in);
	public void fed() {
	ArrayList<String> list=new ArrayList<>();
	System.out.println("Enter your rating =");
	String rating=sc.next();
	System.out.print("Enter your feedback =");
	String fee=sc.next();
	list.add(fee);
	System.out.println("Thank you for feedback");
}
}
class subscription{
	int plan_id;
	int user_id;
	String output="";
	static Scanner sc=new Scanner(System.in);
	public void subs(int subsid,int pid) {
		plan_id=pid;
		//user_id=uid;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
      //  billing bl=new billing();
        calendar.setTime(new Date()); 
        if(plan_id==1) {
        	System.out.println("Would you like to make payment? enter 1 to make payment or else enter any to get into main menu =");
	int pay=sc.nextInt();
	if(pay==1) {
		billing();
	}
        calendar.add(Calendar.DATE, 30);
        output = sdf.format(calendar.getTime());
        System.out.println("Date of expiring ="+output);
        }else if(plan_id==2) {
        	System.out.println("Would you like to make payment? enter 1 to make payment or else enter any to get into main menu =");
			int  pay=sc.nextInt();
			if(pay==1) {
				billing();
			}
			 calendar.add(Calendar.DATE, 35);
            output = sdf.format(calendar.getTime());
            System.out.println("Date of expiring ="+output);
            }
        else if(plan_id==3) {
        	System.out.println("Would you like to make payment? enter 1 to make payment or else enter any to get into main menu =");
			int  pay=sc.nextInt();
			if(pay==1) {
				billing();
			}
            calendar.add(Calendar.DATE, 50);
             output = sdf.format(calendar.getTime());
            System.out.println("Date of expiring ="+output);
            }

Date date = new Date();
System.out.println("Date of Activation ="+date);

	}
public static void billing() {
	System.out.print("Enter your mode of payment =");
	String n=sc.next();
	System.err.println("thanks for your payment");
	}
	
		//br.inp();
		
	}

public class Broad {
	static Scanner s=new Scanner(System.in);
	static ArrayList <Integer> feed=new ArrayList<>();
	public static void main(String[] args) {
	
		inp();
		

	}
	public static void inp() {
		user a=new user();
		int count=0,subsid=0,billid=0;
		//billing bs=new billing();
		String user_status="";
		subscription sub=new subscription();
		System.out.println("---Welcome----");
		System.out.println("enter choice 1 for create account and view the service plan and billing =");
		System.out.println("enter choice 2 for subscription and billing =");
		System.out.println("enter choice 3 for feedback =");
		int choice=s.nextInt();
		if(choice==1) {
			System.out.println("Enter the name=");
			String n=s.next();
			System.out.println("Enter the user-id(String format) =");
			String i=s.next();
			System.out.println("Enter your password=");
			String pass=s.next();
			System.out.println("Enter your gmail=");
			String gmail=s.next();
			user_status="Inactive";
			System.out.println("your serviceplan are currently "+user_status+"  please recharge");
		a.input(count,i,n,gmail,pass);
		count++;
			int id;
			String plan_id="";
			String user_id="";
			System.out.println("Enter 1 for basic plan");
			System.out.println("Enter 2 for economy  plan");
			System.out.println("Enter 3 for premium plan");
			System.out.println("Enter 4 for main Menu");
			System.out.println("Enter your choice");
			id=s.nextInt();
			if(id==1) {
				System.out.println("Basic plan ");
				System.out.println("1 MB/s");
				System.out.println("30 days");
				System.out.println("1 GB per Day");
				System.out.println("300");
				plan_id="1";
				
			}else if(id==2) {
				System.out.println("Economy plan ");
				System.out.println("2 MB/s");
				System.out.println("35 days");
				System.out.println("1.5 Gb per Day");
				System.out.println("400");
				plan_id="2";
				
			}else if(id==3) {
			System.out.println("premium plan ");
			System.out.println("1 MB/s");
			System.out.println("50 days");
			System.out.println("2 gb per day");
			System.out.println("500");
			plan_id="3";
			}else if(id==4) {
				inp();
			}
			System.out.print("Would you like to subscribe the plan enter 1 to contiune/or enter any number to exit =");
			int b=s.nextInt();
			
			if(b==1) {
			user_id=a.userid();
			System.out.print("enter your planid(enter in integer) =");
			int planid=s.nextInt();
			sub.subs(subsid, planid);
			subsid++;
						//pay=pay.toLowerCase();
			
					}
			else {
				System.err.println("Thank you!");
				inp();
			}
			inp();
		}
		else if(choice==2) {
			System.out.println("Enter your user_id =");
			int usid=s.nextInt();
			System.out.println("Enter your plan_id =");
			int plid=s.nextInt();
			sub.subs(subsid, plid);
			subsid++;
			inp();
		}else if(choice==3) {
			feedback fb=new feedback();
			fb.fed();
			inp();
					}
	}
}
