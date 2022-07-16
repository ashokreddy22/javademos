package ash14;
import java.util.Scanner;

public class arraysandfun {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int n,ph,ch,mat;
			int total1;
			int a[]=new int[20];
			System.out.println("enter a number");
			n=sc.nextInt();
			 System.out.println("enter a array elements");
			 for(int i=1;i<=n;i++)
			 {
				 a[i]=sc.nextInt();
				 ph=a[i]/3;
				 ch=a[i]/5;
				 mat=a[i]/6;
				// total(ph,ch,mat);
			 
			 total1=total(ph,ch,mat);
			 System.out.println("total marks" + total()); 
			 }
	}
	public static int total(int ph,int ch,int mat)
	{
		int total_marks=ph+ch+mat;
		return total_marks;
	}

}
	
