import java.util.*;
 abstract class shape{
	abstract void no_of_Sides();
}
class trapezoid extends shape{
	  void no_of_Sides(){
		System.out.println("No of Sides in  trapezoid are 4 ");
	}
}
class Triangle extends shape{
	 public void no_of_Sides(){
		System.out.println("No of Sides in  triangle are  3 ");
	}
}
class Hexagon extends shape{
	 public void no_of_Sides(){
		System.out.println("No of Sides in  hexagon are 6  ");
	}
}

public class AbstractClass {
      public static void main(String args[]){
    	  Scanner sc=new Scanner(System.in);
    	  Triangle tr=new Triangle();
    	  trapezoid trap=new trapezoid();
    	  Hexagon hex=new Hexagon();
    	  System.out.println("Enter your  choice:: \n1.Triangle\n2.Trapezoid\n3.Hexagon");
    	  int t= sc.nextInt();
    	  if(t==1){
    		  tr.no_of_Sides();
    	  }
    	  else if(t==2){
    		  trap.no_of_Sides();
    	  }
    	  else if(t==3){
    		  hex.no_of_Sides();
    	  }
    	  else{
    		  System.out.println("Invalid Selection");
    		  System.exit(0);
    	  }
      }
}
