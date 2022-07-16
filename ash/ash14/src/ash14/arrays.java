package ash14;

import java.util.Scanner;

public class arrays {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		n = sc.nextInt();
		int a[] = new int[5];
		System.out.println("enter array elements");
		a[n]=sc.nextInt();
		for (int i = 0; i <= n; i++) {
			
a[i] = sc.nextInt();
			if (a[i] % n == 0)
				System.out.println(a[i]);

		}

	}
}
