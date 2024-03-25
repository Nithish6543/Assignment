package fitness;
import java.util.Arrays;
import java.util.*;
class socialfeauture extends user {
	static Scanner sc=new Scanner(System.in);
public void feauture(int usid) {
	System.out.println("------Social feauture------");
	System.out.println("Enter 1 to view your achievements");
	System.out.println("Enter 2 to view leaderboard");
	System.out.println("Enter 3 to manage friends");
	System.out.print("Enter your choice=");
	int choice=sc.nextInt();
	if(choice==1) {
		Goal g=new Goal();
		g.achievements(usid);
	}else if(choice==2) {
		leaderboard();
	}else if(choice==3) {
		friend(usid);
	}	
}
public void leaderboard() {
	int size=ar.size();
	int ar1[]=new int[size];
	for(int i=0;i<size;i++) {
		ar1[i]=ar.get(i).size();
	}Arrays.sort(ar1);
	System.out.println("no Username  completed workouts");
	int k=1;
	for(int i=ar1.length-1;i>=0;i--) {
		for(int j=0;j<size;j++) {
			if(ar1[i]==ar.get(j).size()) {
				System.out.println(k+"   "+user_name.get(j)+"   "+ar1[i]);
				k++;
				break;
			}
		}
	}
}
public void friend(int usid) {
	System.out.println("Enter 1 to remove friends");
	System.out.println("Enter 2 to add friends");
	System.out.println("Enter 3 to view the friends");
	System.out.print("Enter your choice=");
int choice=sc.nextInt();
if(choice==2) {
	System.out.print("Enter your friend name= ");
String frname=sc.next();
for(int i=0;i<user_name.size();i++) {
if(frname.equals(user_name.get(i))) {
	friendrequest.get(usid).add(user_id.get(i));
	System.out.println("you have added a friend "+frname);
}
}
System.out.println("no friend found");
}
else if(choice==3) {
	System.out.println("your friend List are");
	for(int i=0;i<friendrequest.get(usid).size();i++) {
		int c=friendrequest.get(usid).get(i);
		for(int j=0;j<user_id.size();j++) {
			if(c==user_id.get(j)&&usid!=c) {
				System.out.println("your friend :"+user_name.get(j));
			}
		}
	}
}
else if(choice==1) {
	System.out.println("Enter the friend name to remove");
	String nam=sc.next();
	for(int i=0;i<user_name.size();i++) {
		if(user_name.get(i).equals(nam)) {
			for(int j=0;j<friendrequest.get(usid).size();j++) {
				if(user_id.get(i)==friendrequest.get(usid).get(j)) {
					friendrequest.get(usid).set(j,usid);
					System.out.println("your Friend "+user_name.get(i)+" sucesssfully removed");
					break;
				}
			}
		}
	}
	}
}
}
