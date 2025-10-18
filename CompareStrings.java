import java.util.Scanner;
public class CompareStrings{
	static int usrstrcmp(String s1,String s2){
	return s1.compareTo(s2);
	}
	static int usrstrcmp(String s1,String s2,int n){
	String sub1;
	if(n>s1.length())
		sub1=s1;
	else
		sub1=s1.substring(0,n);
	return sub1.compareTo(s2);
	}
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter first string: ");
	String str1=sc.nextLine();
	System.out.print("Enter second string: ");
	String str2=sc.nextLine();
	
	int result1=usrstrcmp(str1,str2);
	if(result1==0)
		System.out.println("Both strings are equal.");
	else if(result1>0)
		System.out.println("First String is greater than second string.");
	else
		System.out.println("First String is lesser than second string.");
	
	System.out.println("Enter the number of characters to compare:");
	int n=sc.nextInt();
	int result2=usrstrcmp(str1,str2,n);
	
	if(result2==0){
			System.out.println("First"+n+"characters of first string matches the second one");}
	else if(result2>0){
			System.out.println("First"+n+"characters of first string  greater than the second one");}
	else{
			System.out.println("First"+n+"characters of first string  lesser than the second one");}
			
		}}
	
