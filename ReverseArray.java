package day2;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter array size:");
		int n= sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
        for(int i=n-1;i>=0;i--)
        {
        	System.out.print("\t"+a[i]);
        }
		sc.close();
	}

}
