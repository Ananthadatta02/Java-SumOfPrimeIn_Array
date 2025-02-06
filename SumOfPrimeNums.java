package primeNum_and_Summations;

import java.util.Scanner;

public class SumOfPrimeNums 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size = s.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		int sum = 0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(isPrime(arr[i]))
			{
				sum += arr[i];
				System.out.print(arr[i] + ",");
			}
		}
		System.out.println("Sum Of Prime Numbers " + sum);
	}
	public static boolean isPrime(int n)
	{
		int count = 0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			return true;
		else
			return false;
	}
}
