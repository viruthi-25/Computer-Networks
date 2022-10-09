import java.io.*;
import java.util.*;
import java.io.FileReader;
public class Receiver
{
public static void main(String[] args)
{
int i,n,t=1;
LinkedList<String> l = new LinkedList<String>();
LinkedList<String> l1 = new LinkedList<String>();
LinkedList<String> l2 = new LinkedList<String>();
try
{
FileInputStream fis=new FileInputStream("v2.txt");       
Scanner sc=new Scanner(fis); 
int m=0;
while(sc.hasNextLine())  
{  
l.add(sc.nextLine());
}

if((l.getFirst()).equals("01111110"))
{
//	System.out.println("No error!!");
	l.removeFirst();
}
else
{
	System.out.println("Starting Frame Error!!");
	t=0;
}
if((l.getLast()).equals("01111110"))
{
	//System.out.println("No error!!");
	l.removeLast();
}
else
{
	System.out.println("Ending Frame Error!!");
     t=0;
}

if(t==1)
{
int r=0;
for(i=0; i<l.size();i++)
{
      String s= (l.get(i)); 
 n=s.length();
char[] arr = new char[s.length()];
for (i = 0; i <n ; i++)
{
arr[i] = s.charAt(i); 
l1.add(Character.toString(arr[i]));
}
for (i = 0; i <l1.size() ; i++)
{
	if(l1.get(i).equals("1"))
	{
		l2.add("1");
		r++;
	}
	else
	{
		if(r==5)
		{
			r=0;
			continue;
		}
		else
			l2.add("0");
	}
}
for (i = 0; i <l2.size() ; i++)
{
System.out.print(l2.get(i)); 
}
}
sc.close();
fis.close();
}
}
catch(IOException e)
{
System.out.println("Exception found!");
}
}
}

