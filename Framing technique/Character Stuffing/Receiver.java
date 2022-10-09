import java.io.*;
import java.util.*;
import java.io.FileReader;
public class Charr
{
public static void main(String[] args)
{
int i,n,t=1;
LinkedList<String> l = new LinkedList<String>();
try
{
	FileInputStream fis=new FileInputStream("v1.txt");       
Scanner sc=new Scanner(fis); 
int m=0;
while(sc.hasNextLine())  
{  
m++;
l.add(sc.nextLine());            
}  
if((l.getFirst()).equals("stx"))
{
	System.out.println("No error!!");
	l.removeFirst();
}
else
{
	System.out.println("Starting Frame Error!!");
}
if((l.getLast()).equals("etx"))
{
	System.out.println("No error!!");
	l.removeLast();
}
else
{
	System.out.println("Ending Frame Error!!");
     t=0;
}
if(t==1)
{
List<String> al = new ArrayList<String>(l);
for(i=0; i<al.size()-1;i++)
{
     if(al.get(i).equals("dle"))
	 {
		 al.remove(i);
	 }
}
for(i=0; i<al.size();i++)
{
      System.out.println(al.get(i));    
}
sc.close();
}}
catch(IOException e)
{
System.out.println("Exception found!");
}
}
}
