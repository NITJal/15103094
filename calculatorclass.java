import java.util.*;
import java.lang.*;
public class calculatorclass implements calculator
{
	public int sum(int a,int b)
    {
  	  return a+b;
    }
    public int subtract(int a,int b)
    {
  	  return a-b;
    }
    public int divide(int a,int b)
    {
  		  return a/b;
    }
    public int multiply(int a,int b)
    {
  	  return a*b;
    }  
    public  int Mini(int a, int b){
    	return((a<b)?a:b);
    }
    public  int Max(int a, int b){
    	return((a>b)?a:b);
    }
    public double cosine(double a){
      double c=Math.cos(a);
      return c;
    }
    public double sine(double a){
        double c=Math.sin(a);
        return c;
      }
    public double Square(double a){
    	double d=Math.pow(a, 2);
    	return d;
    }
    
	public static void main(String args[]) throws Exception
      {
		calculatorclass obj=new calculatorclass();
    	 Scanner sc=new Scanner(System.in);
    	 while(true){
    	 System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Maximum\n6.Minimum\n7.Cosine\n8.Sine\n9.Square\n10.Exit\n");
    	 int n=sc.nextInt();
    	 int a,b;
    	 double c,d;
    	 
    	 switch(n)
    	 {
    	 case 1:
    		 System.out.println("Enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.sum(a, b));break;
    	 case 2:
    		 System.out.println("Enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.subtract(a, b));break;
    	 case 3:
    		 System.out.println("Enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.multiply(a, b));break;
    	 case 4:
    		 System.out.println("Enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 try{
    		 System.out.println("Ans::"+obj.divide(a, b));break;
    		 }
    		 catch(Exception e)
    		 {
    			 System.out.println("It's mathematically invalid");
    		 }
    	 case 5: 
    		 System.out.println("Enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.Max(a, b));break;
    	 case 6:
    		 System.out.println("Enter the numbers");
    		 a=sc.nextInt();
    		 b=sc.nextInt();
    		 System.out.println("Ans::"+obj.Mini(a, b));break;
    	 case 7:
    		 System.out.println("Enter the number");
    		 c=sc.nextDouble();
    		 System.out.println("Ans::"+obj.cosine(c));break;
    	 case 8:
    		 System.out.println("Enter a number");
    		 d=sc.nextDouble();
    		 System.out.println("Ans::"+obj.sine(d));break;
    	 case 9: System.out.println("Enter a number");
		         d=sc.nextDouble();
		          System.out.println("Ans::"+obj.Square(d));break;
    	 case 10:System.exit(0);
    	        break;
    	 default:
    		   break;
    	 }
    	Thread.sleep(2000);
      }
      
}
}

