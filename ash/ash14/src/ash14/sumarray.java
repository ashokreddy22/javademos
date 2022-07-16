package ash14;

import java.util.Scanner;

public class sumarray {
	


	public static void main(String[] args) {
		 int a[] = { 10, 2, 25, 6, 8};
		 int temp=0;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++) {
				 if(a[i]>a[j]) {
					 temp=a[i];
				     a[i]=a[j];
				     a[j]=temp;}
			 }
		 }
          for(int i=0;i<a.length;i++) {
		System.out.println("minimum number in an array" + a[i]);}
	}
}
