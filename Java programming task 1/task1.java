package Sample;
import java.util.*;
public class sri {

	public static void main(String[] args) {
		int items[]= {100,200,300,400,500,600};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total ids");
		int n=sc.nextInt();
		double disc_price;
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the id number");
			int id=sc.nextInt();
			System.out.println("Enter the quantity");
			int id_q=sc.nextInt();
			if(id==5004 || id==5005) 
			{
				disc_price=items[id%10]*id_q*0.8;
				System.out.println("The revenue for itemID "+id+" is "+disc_price);
			}
			else 
			{
				disc_price=items[id%10]*id_q;
				System.out.println("The revenue for itemID "+id+" is "+disc_price);
			}
		}
	}
}
