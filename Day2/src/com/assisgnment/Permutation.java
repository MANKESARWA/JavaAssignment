package com.assisgnment;
import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
		System.out.print("Total number N = ");
		
		int i,n = sc.nextInt();
		int []arr=new int[n];
		int fact =1;
		for(i = 1;i<=n;i++)
		{
			fact=fact*i;
		}
		
		for(i = 0; i<n;i++) {
			System.out.print("Number #"+(i+1)+": ");
			arr[i] = sc.nextInt();
		}
		
		permutaion(arr,0);
		
		System.out.println("The permutations of ("+arr[0]+","+arr[1]+","+arr[2]+") are: "+fact);
		
	}

	public static void permutaion(int []arr,int pos) {
		int fact = 1;
		 
		if(pos>=arr.length-1) {
			System.out.print("(");
			for(int i = 0;i<arr.length-1;i++) {
				System.out.print(arr[i]+",");
			}
			
			if(arr.length>0) {
				System.out.print(arr[arr.length-1]);
			}
			System.out.print(")");
			System.out.println();
		}
		for(int i = pos;i<arr.length;i++) {
			int temp;
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			permutaion(arr, pos+1);
			
			temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
			
		}
		
	}
	
}
