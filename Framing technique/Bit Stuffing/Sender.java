import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
public class Sender
{
public static void main(String[] args)
{
String x="01111110";
Scanner sc=new Scanner(System.in);
LinkedList <String>l=new LinkedList <>();
LinkedList <String>l1=new LinkedList <>();
System.out.println("Enter the message to be sent:");
String s=sc.nextLine();
char[] arr = new char[s.length()];
int n=s.length();
for (int i = 0; i <n ; i++)
{
arr[i] = s.charAt(i);
l.add(Character.toString(arr[i]));
}
try
{
FileWriter w1=new FileWriter("v2.txt",true);
BufferedWriter w = new BufferedWriter(w1);
int r=0;
w.write(x);
w.newLine();

for(int i=0;i<(l.size());i++)
{
if(l.get(i).equals("1"))
	{
	r++;
	if(r==5)
	{
		l1.add("1");
		l1.add("0");
		r=0;
	}
	else
	{
		l1.add("1");
		continue;
	}
	}
else
	l1.add("0");
	 r=0;
}
for(int i=0;i<(l1.size());i++)
{
	w.write(l1.get(i));
}
w.newLine();
w.write("01111110");
w.newLine();
w.close();
w1.close();
}

catch(IOException e)
{
System.out.println("Exception found!");
}
}
}
