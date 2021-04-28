package br.com.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class javaTeste {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       int c = scan.nextInt();
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);

	}

   public static void main(String[] args) {
       int N = scanner.nextInt();
       scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
       if(N % 2 != 0 || (N <= 20 && N >= 6)) {
       	System.out.println("Weird");
       	return;
       }
       System.out.println("Not Weird");
       scanner.close();
   }

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int i = scan.nextInt();
       double d = scan.nextDouble();
       scan.nextLine();
       String s = scan.nextLine();

       System.out.println("String: " + s);
       System.out.println("Double: " + d);
       System.out.println("Int: " + i);
   }

   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       
       System.out.println("================================");
       for(int i=0;i<3;i++){
           String s1=sc.next();
           int x=sc.nextInt();
//            String xs = String.format("%-3d", x).replace(' ', '0');
          System.out.format("%1$-15s%2$03d%n", s1, x);
       }
       System.out.println("================================");

   }

	public static void main(String[] args) {
	        int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        for(int i = 1; i < 11; i++) {
	        	System.out.println(N + " x " + i + " = " +(N * i));
	        }
	        scanner.close();
	 }

	public static void main(String []argh){
		
		Scanner in = new Scanner(System.in);
       int t=in.nextInt();
       for(int i=0;i<t;i++){
           int a = in.nextInt();
           int b = in.nextInt();
           int n = in.nextInt();
           int result = a;
           for (int j = 0; j < n; j++) {
           	result += (Math.pow(2, j)* b);
           	System.out.print(result);
           	if(j != n - 1) {
           		System.out.print(" ");
           	}
           }
           System.out.println("");
       }
   }

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i = 0; i < t; i++) {

			try {
				long x = sc.nextLong();
				System.out.println(x + " can be fitted in:");
				if (x >= -128 && x <= 127)
					System.out.println("* byte");
				if (x >= -32768 && x <= 32767)
					System.out.println("* short");
				if (x >= -2147483648 && x <= 2147483647)
					System.out.println("* int");
				System.out.println("* long");

			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}

	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder();
		int i = 1;
		while(scanner.hasNextLine()) {
			str.append(i + " ");
			str.append(scanner.nextLine());
			if(scanner.hasNextLine()){
               str.append("\n");
           }
			i++;
		}
		System.out.println(str.toString());
	}

	private static int B, H;
	private static boolean flag;
	static {

		B = scanner.nextInt();
		H = scanner.nextInt();
		
		flag = B >= 0 && H >= 0 && B < 100 && H < 100;
		
		if(!flag){
			System.out.println("java.lang.Exception: Breadth and height must be positive");
		}
	}

	public static void main(String[] args) throws Exception{
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}// end of main

	public static void main(String[] args) throws IOException {

       int month = 8;

       int day = 5;

       int year = 2015;

       String res = Result.findDay(month, day, year);
       
       System.out.println(res);
   }

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
		
		Locale INDIA = new Locale("en", "IN");
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String india = NumberFormat.getCurrencyInstance(INDIA).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}

	public static void main(String[] args) {
       
       Scanner sc = new Scanner(System.in);
       String A = sc.next();
       String B = sc.next();
       
       System.out.println(A.length() + B.length());
       if(A.compareTo(B) < 0) System.out.println("No");
       else System.out.println("Yes");
       System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
       
   }

	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.next();
       int k = scan.nextInt();
       scan.close();
     
       System.out.println(getSmallestAndLargest(s, k));
   }
	
	public static String getSmallestAndLargest(String s, int k) {
       String smallest = "";
       String largest = "";
       int sSize = s.length();
       if(k <= sSize) {
       	int sComparate = sSize - (k - 1);
       	smallest = s.substring(0,k);
       	largest = s.substring(0,k);
       	System.out.print(smallest+" - ");
       	for (int i = 1; i < sComparate;i++) {
       		System.out.print(s.substring(i,i+ k)+" - ");
       		if(smallest.compareTo(s.substring(i, i + k)) > 0) {
       			smallest = s.substring(i,i+k);
       		}
       		if(largest.compareTo(s.substring(i, i + k)) < 0) {
       			largest = s.substring(i,i+k);
       		}
       	}
       	System.out.println("");
       	return smallest + "\n" + largest;
       }
       return "Wrong";
   }

	public static void main(String[] args) {
       
       Scanner sc=new Scanner(System.in);
       String A=sc.next();
       
       StringBuilder str = new StringBuilder(A);
       String AReverse = str.reverse().toString();
       
       if(A.equals(AReverse)) {
       	System.out.println("Yes");
       	return;
       }
       System.out.println("No");
   }

	static boolean isAnagram(String a, String b) {
		if (a.length() == b.length()) {
			List<Character> aChars = new ArrayList<Character>();
			List<Integer> aQuant = new ArrayList<Integer>();
			List<Character> bChars = new ArrayList<Character>();
			List<Integer> bQuant = new ArrayList<Integer>();
			aChars.add(a.charAt(0));
			aQuant.add(1);
			bChars.add(b.charAt(0));
			bQuant.add(1);
			for (int i = 1; i < a.length(); i++) {
				if(aChars.contains(a.charAt(i))) aQuant.set(aChars.indexOf(a.charAt(i)), aQuant.get(aChars.indexOf(a.charAt(i))) + 1);
				else {
					aChars.add(a.charAt(i));
					aQuant.add(1);
				}
				if(bChars.contains(b.charAt(i))) bQuant.set(bChars.indexOf(b.charAt(i)), bQuant.get(bChars.indexOf(b.charAt(i))) + 1);
				else {
					bChars.add(b.charAt(i));
					bQuant.add(1);
				}
			}
			char aux = 0;
			int auxnumb = 0;
			for (int i = 0; i < aChars.size(); i++) {
				for(int j = 0; j < aChars.size() - 1; j++) {
					if(aChars.get(j) > aChars.get(j +1)) {
						aux = aChars.get(j+1);
						aChars.set(j+1,aChars.get(j));
						aChars.set(j,aux);		
						
						auxnumb = aQuant.get(j+1);
						aQuant.set(j+1, aQuant.get(j));
						aQuant.set(j, auxnumb);
					}
					if(bChars.get(j) > bChars.get(j +1)) {
						aux = bChars.get(j+1);
						bChars.set(j+1,bChars.get(j));
						bChars.set(j,aux);		
						
						auxnumb = bQuant.get(j+1);
						bQuant.set(j+1, bQuant.get(j));
						bQuant.set(j, auxnumb);
					}
				}
			}
			for (int i = 0; i < aQuant.size(); i++) {
				if(aQuant.get(i) == bQuant.get(i)) {
					continue;
				}
				return false;
			}
			return true;
		}
		return false;
	}

	static boolean isAnagram(String a, String b) {
       int aLen = a.length(), bLen = b.length();
       
       if(aLen != bLen) return false;
       
       a = a.toLowerCase();
       b = b.toLowerCase();

       char[] ac = a.toCharArray();
       char[] bc = b.toCharArray();
       int[][] aQuant = new int[26][2];
       int[][] bQuant = new int[26][2];

       for(int i = 0, j = 97; i < 26; i++, j++) {
       	aQuant[i][0] = j;
       	aQuant[i][1] = 0;
       	bQuant[i][0] = j;
       	bQuant[i][1] = 0;
       }
       for (char c : ac) {
       	int ic = (int) c;
       	for (int i = 0; i < 26; i++) {
       		if(aQuant[i][0] == ic) {
       			aQuant[i][1]++;
       			break;
       		}
       	}
       }
       for (char c : bc) {
       	int ic = (int) c;
       	for (int i = 0; i < 26; i++) {
       		if(bQuant[i][0] == ic) {
       			bQuant[i][1]++;
       			break;
       		}
       	}
       }
       for(int i = 0; i < 26; i++) {
       	if(aQuant[i][1] != bQuant[i][1]) return false;
       }
       return true;
   }
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
	
	public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       String s = scan.nextLine().trim();
       
       String[] items = s.split("[-'!_, ?.@]+");
       if(s.equals("")) System.out.println(0);
       else System.out.println(items.length);
       
       for(String ss : items) {
       	System.out.println(ss);
       }
       
       scan.close();
   }
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			try {
				Pattern P = Pattern.compile(pattern);
				System.out.println("Valid");
			}catch(Exception e) {
				System.out.println("Invalid");
			}
			testCases--;
			
		}
	}
}

class Result {

	/*
	 * Complete the 'findDay' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. INTEGER month 2. INTEGER day 3. INTEGER year
	 */

	public static String findDay(int month, int day, int year) {
		LocalDate dt = LocalDate.of(year, month, day);
		return dt.getDayOfWeek().toString();
	}
}
