package fitness;
import java.util.ArrayList;
import java.util.Scanner;
 class workoutplan extends user {
	protected static ArrayList<String> ar1=new ArrayList<>();
	static Scanner sc=new Scanner(System.in);
	static int runn=0;
	static int walk=0;
	static int cycl=0;
	static int swim=0;		

public void plan(int usid) {
	System.out.println("-----Welcome to workoutplan------");

	activitytracking act=new activitytracking();
   System.out.println("enter 1 for RUNNING");
		System.out.println("enter 2 for  WALKING");
		System.out.println("enter 3 for  CYCLING");
		System.out.println("enter 4 for  SWIMMING");
		System.out.println("enter 5 to exit");
		System.out.print("Enter your choice =");
		//ar.get(usid-1).add("demo");
		int choice1=sc.nextInt();
		if(choice1==1) {
			System.out.println(" RUNNING");
			String z=act.running(usid);
			if(ar.size()==usid) {
			ar1.add(z);
			}
			else {
				ar.get(usid).add(z);
			}
		runn++;
			System.out.println("You have completed an workoutplan");
            plan(usid);
		}else if(choice1==2) {
			System.out.println("WALKING");
            String z=act.walking(usid);
            if(ar.size()==usid) {
    			ar1.add(z);
    			}
    			else {
    				ar.get(usid).add(z);
    			}
           
            System.out.println("You have completed an workoutplan");
            walk++;
            plan(usid);
		}else if(choice1==3) {
			System.out.println("CYCLING");
            String z=act.cycling(usid);
            if(ar.size()==usid) {
    			ar1.add(z);
    			}
    			else {
    				ar.get(usid).add(z);
    			}
            cycl++;
            System.out.println("You have completed an workoutplan");
            plan(usid);
		}else if(choice1==4) {
			System.out.println("SWIMMING");
            String z=act.swimming(usid);
            swim++;
            if(ar.size()==usid) {
    			ar1.add(z);
    			}
    			else {
    				ar.get(usid).add(z);
    			}
            System.out.println("You have completed an workoutplan");
            plan(usid);
		}
		else   {
			if(ar.size()==usid) {
				ar.add(ar1);
    			}
			
			System.out.println("you are redirected to Main Menu");
	    				running.set(usid,running.get(usid)+runn);
	    				walking.set(usid,walking.get(usid)+walk);
	    				cycling.set(usid,running.get(usid)+cycl);
	    				running.set(usid,running.get(usid)+runn);
	    		
		}
		 
	}
}