
import java.util.*;

public class LineComparision {

	public static void main(String[] args) {
		
		Scanner endpoints= new Scanner(System.in); 
		
		//Taking start and end coordinates of line from user

		System.out.println("Enter coordinates for Line1 ");

		System.out.print("Enter x1 ");  
		double x1= endpoints.nextInt();
		
		System.out.print("Enter y1 ");  
		double y1= endpoints.nextInt();  
		
		System.out.print("Enter x2 ");  
		double x2= endpoints.nextInt();  
		
		System.out.print("Enter y2 ");  
		double y2= endpoints.nextInt();

		System.out.println("Enter coordinates for Line2");

 		System.out.print("Enter x3 ");
 		double x3= endpoints.nextInt();

 		System.out.print("Enter y3 ");
 		double y3= endpoints.nextInt();

 		System.out.print("Enter x4 ");
 		double x4= endpoints.nextInt();

 		System.out.print("Enter y4 ");
 		double y4= endpoints.nextInt();

	
		System.out.println("Line1 coordinates are x1="+x1+"; y1="+y1+"; x2="+x2+"; y2="+y2);
		
		 System.out.println("Line2 coordinates are x3="+x3+"; y3="+y3+"; x4="+x4+"; y4="+y4);
		//Calculating length of line
		
		double length1=Math.sqrt(Math.pow((x2-x1),2) +Math.pow((y2-y1),2));
		
		double length2=Math.sqrt(Math.pow((x4-x3),2) +Math.pow((y4-y3),2));

		System.out.println("The length of line is "+length1);

		 System.out.println("The length of line is "+length2);
	
	
	
	}

}
