package fitness;
import java.util.*;
class activitytracking extends user {
private static int distance;
private static int duration;
private static int caloriesburn;
static Scanner sc=new Scanner(System.in);
public activitytracking() {
	distance=0;
	duration=0;
	caloriesburn=0;
}
	public String running(int usid) {
		System.out.println("Enter the Running distance(metre) :");
		distance=sc.nextInt();
		distances.set(usid,distance);
		System.out.println("Enter the completed duration(minutes) :");
		duration=sc.nextInt();
		int weigth1=weight.get(usid);
		int caloriesburn= ((distance/1000)*(duration/60)*weigth1);
		caloriesburned.set(usid,caloriesburn);
		System.out.println("Running complted succesfully");
		String n="running";
		Goal g=new Goal();
		g.remainder();
		return n;
	}
	public String walking(int usid) {
		System.out.println("Enter the Running distance(metre) :");
		distance=sc.nextInt();
		distances.set(usid,distance);
		System.out.println("Enter the completed duration(minutes) :");
		duration=sc.nextInt();
		int weigth1=weight.get(usid);
		int caloriesburn= ((distance/1000)*(duration/60)*weigth1);
		caloriesburned.set(usid,caloriesburn);
		System.out.println("Walking completed succesfully");
		String n="walking";
		Goal g=new Goal();
		g.remainder();
		return n;

	}
	public String swimming(int usid) {
		System.out.println("Enter the Running distance(metre) :");
		distance=sc.nextInt();
		distances.set(usid,distance);
		System.out.println("Enter the completed duration(minutes) :");
		duration=sc.nextInt();
		int weigth1=weight.get(usid);
		int caloriesburn= ((distance/1000)*(duration/60)*weigth1);
		caloriesburned.set(usid,caloriesburn);
		System.out.println("swimming completed succesfully");
		String n="swimming";
		Goal g=new Goal();
		g.remainder();
		return n;

	}
	public String cycling(int usid) {
		System.out.println("Enter the Running distance(metre) :");
		distance=sc.nextInt();
		distances.set(usid,distance);
		System.out.println("Enter the completed duration(minutes) :");
		duration=sc.nextInt();
		int weigth1=weight.get(usid);
		int caloriesburn= ((distance/1000)*(duration/60)*weigth1);
		caloriesburned.set(usid,caloriesburn);
		System.out.println("Cycling completed succesfully");
		String n="cycling";
		Goal g=new Goal();
		g.remainder();
		return n;
	}
}
