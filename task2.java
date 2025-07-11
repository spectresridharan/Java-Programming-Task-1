package Sample;
import java.util.*;
public class task2 {

	public static void main(String[] args) {
		int items[]= {100,200,300,400,500,600};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total ids");
		int n=sc.nextInt();
		double disc_price=0.0;
		for(int i=0;i<n;i++) 
		{
			System.out.println("Enter the id number of the returned item");
			int id=sc.nextInt();
			System.out.println("Enter the quantity");
			int id_q=sc.nextInt();
			if(id==5004 || id==5005) 
			{
				disc_price+=(items[id%10]*id_q)*0.8;
			}
			else 
			{
				disc_price+=items[id%10]*id_q;
			}
		}
		System.out.println("The refund amount for the products returned is "+disc_price);
}
}
