import java.io.*;
import java.util.*;
public class Sender
{
public static void main(String[] args)
{
	LinkedList <String> l= new LinkedList<>();
	int count=0,x;
	int sum=0;
	String s1="0",s3="",s8,s2;
	Scanner sc=new Scanner(System.in);
	try
	{
	FileWriter fw=new FileWriter("checksum.txt");
	BufferedWriter w=new BufferedWriter(fw);
	String s=sc.nextLine();
	int n=s.length();
	//System.out.println(n);
	int n1=n;
	if(n1%8==0)
	{
		System.out.println("NO issues!!");
	}
	else
	{
		int b=n1%8;
		x=8-b;
		for(int i=0;i<x;i++)
		{
			s=s1+s;
		}
	}
	System.out.println(s);
	//System.out.println(s.length());
	List<String> l1 = new ArrayList<>();
    int length1 = s.length();

    for (int i = 0; i < length1; i += 8) {
        l1.add(s.substring(i, Math.min(length1, i + 8)));
    }
for(int i=0;i<l1.size();i++)
{
	w.write(l1.get(i));
}
String[] str= new String[l1.size()];
for(int i=0;i<l1.size();i++)
{
	 str[i]=l1.get(i);
}
for(int i=0;i<l1.size();i++)
{
	int b1 = Integer.parseInt(str[i], 2);
	sum+=b1;
	//System.out.println(b1);
}
 s2=Integer.toBinaryString(sum);
 //System.out.println(s2);
 //System.out.println("s2 length:" +s2.length());
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
//System.out.println(s3);

int b2 = Integer.parseInt(s3,2);
	int sum1=b2+1;
	String s7=Integer.toBinaryString(sum1);
	int n2=s7.length()%8;
	StringBuffer sb = new StringBuffer(s7);
	if(n2==0)
	{
		 String sb1 = sb.toString();
	w.write(sb1);
	}
	else
	{
		for(int i=0;i<n2;i++)
		{
			sb.deleteCharAt(i);
		}
		 String sb1 = sb.toString();
	w.write(sb1);
	}
	w.close();
	fw.close();
}	
catch(IOException e)
{
System.out.println("Exception found!");
}
}
}
