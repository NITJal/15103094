import java.util.*;
public class namesort {
 public static void main(String args[])throws Exception{
	 ArrayList <String> al=new ArrayList();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the number of names");
	 int t=sc.nextInt();
	 for(int i=0;i<t;i++){
		 System.out.println("Enter name"+(i+1));
		 String s=sc.next();
		 al.add(s);
	 }
	 Collections.sort(al);
	 Thread.sleep(1000);
	 Iterator it=al.iterator();
	 System.out.println("The final order is");
	 while(it.hasNext()){
		System.out.println(it.next());
		Thread.sleep(50);
	 }
		 
 }
}
