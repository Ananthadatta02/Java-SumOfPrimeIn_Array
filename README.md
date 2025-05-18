


# Prime Numbers Summation in Java

This Java program reads an array of numbers, identifies prime numbers, and calculates their sum. It optimizes prime checking using the square root method for better efficiency. The program ensures proper input handling and prints the prime numbers found.

## 💻 Uses
- Helps in understanding **prime numbers** and their properties.
- Demonstrates **efficient prime number checking** using the square root method.
- Provides a **real-world example** of working with arrays and loops in Java.
- Useful for **number theory problems** and **competitive programming**.

---

## 🔢 What is a Prime Number?
A **prime number** is a natural number greater than **1** that has only **two factors**: **1 and itself**.

**Examples of Prime Numbers:** 2, 3, 5, 7, 11, 13, 17, 19, 23, 29...

**Non-Prime Numbers (Composite Numbers):**
- 4 (Factors: 1, 2, 4)
- 6 (Factors: 1, 2, 3, 6)
- 9 (Factors: 1, 3, 9)

### Special Cases:
- **1 is NOT a prime number** (it has only one factor: 1 itself).
- **2 is the only even prime number** (since all other even numbers are divisible by 2).

---

## ⚡ How This Program Works
### **1️⃣ Input Handling**
- The user is prompted to **enter the size** of the array.
- The user then inputs **elements** into the array.

### **2️⃣ Identifying Prime Numbers**
- Each number in the array is checked using the `isPrime()` method.
- If a number is **prime**, it is added to the `sum`.

### **3️⃣ Displaying Output**
- The program prints **all prime numbers found** in the array.
- It displays the **sum of all prime numbers**.

---

## 🔍 Understanding the `isPrime()` Method
The `isPrime()` method determines whether a given number is **prime or not**.

### **Prime Checking Algorithm According to Your Code**
1. **Initialize `count = 0`**, which keeps track of the number of factors.  
2. **Loop from `1` to `n`** and check if `n` is divisible by `i`.  
3. **Increase `count`** whenever `n % i == 0`.  
4. **If `count == 2`**, return `true` (the number has only two factors: 1 and itself, meaning it's prime).  
5. **Otherwise, return `false`** (the number has more than two factors, meaning it's not prime). 

---

## 📜 Full Java Code
```java
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

```

---

## 🎯 Sample Input/Output
### **Input:**
```
Enter the Size of Array
10
Enter the Elements
2 5 9 5 4 7 68 81 71 3
```

### **Output:**
```
Prime Numbers: 2 5 5 7 71 3
Sum Of Prime Numbers: 93
```

---

## 🔥 Key Takeaways
- **Efficient Prime Number Detection** using the square root method.
- **Usage of Arrays** and **Enhanced For Loop** in Java.
- **Optimized Performance** with early exits for even numbers.
- **Proper Input Handling** with `Scanner` class.

---
## Clone
```
git clone https://github.com/Ananthadatta02/Java-SumOfPrimeIn_Array.git
```
