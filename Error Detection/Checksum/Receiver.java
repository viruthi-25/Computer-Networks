import java.io.*;
import java.util.*;
public class Receiver
{
public static void main(String[] args)
{
	LinkedList <String> l= new LinkedList<>();
	LinkedList <String> l1= new LinkedList<>();
	int count=0;
	int sum=0;
	String s="",s1="0",s3="",s8,s2,sb1="";
	try
	{
	FileInputStream fis=new FileInputStream("checksum.txt");       
	Scanner sc=new Scanner(fis); 
	int m=0;
	while(sc.hasNextLine())  
	{  
	s=(sc.nextLine());
	}
	System.out.println("String is :"+s);
    int length1 = s.length();
	for (int i = 0; i < length1; i += 8) 
	{
        l1.add(s.substring(i, Math.min(length1, i + 8)));
    }
String[] str= new String[l1.size()];
for(int i=0;i<l1.size();i++)
{
	 str[i]=l1.get(i);
	 System.out.println(str[i]);
}
for(int i=0;i<l1.size();i++)
{
	int b1 = Integer.parseInt(str[i], 2);
	sum+=b1;
}
 s2=Integer.toBinaryString(sum);
 System.out.println("Sum is :"+s2);
 for(int i=0;i<s2.length();i++)
{
	if(s2.charAt(i)=='1')
	{
		s3=s3+"0";
	}
	else if(s2.charAt(i)=='0')
	{
		s3=s3+"1";
	}
}
System.out.println("1's comp:" +s3);

int b2 = Integer.parseInt(s3,2);
	int sum1=b2+1;
	String s7=Integer.toBinaryString(sum1);
 System.out.println("2's Comp "+s7);
 	int n2=s7.length()%8;
	StringBuffer sb = new StringBuffer(s7);
	if(n2==0)
	{
	 sb1 = sb.toString();
	}
	else
	{
		for(int i=0;i<n2;i++)
		{
			sb.deleteCharAt(i);
		}
		  sb1 = sb.toString();
	}
	//System.out.println(sb1);
 for(int i=0;i<sb1.length();i++)
 {    
 if(sb1.charAt(i)=='1')
	count++;
	}
if(count==0)
	System.out.println("No error while transmitting!!");
else
	System.out.println("Error while transmitting!!");
}	
catch(IOException e)
{
System.out.println("Exception found!");
}
}
}
