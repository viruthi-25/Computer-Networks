import java.io.*;
import java.util.*;
import java.io.FileReader;
public class Charsender
{
public static void main(String[] args)
{
int k,word=0;
Scanner sc=new Scanner(System.in);
ArrayList<String> l= new ArrayList<>();
System.out.println("\nEnter String");
String s2=sc.nextLine();
String[] words=(s2.split("\\s"));
for(String w1:words){  

l.add(w1);  
}  
ArrayList<String>l2=new ArrayList<>();
l2.add("stx");
for(int i=0;i<(l.size());i++)
{
        if(l.get(i).equals("dle"))
        {
        l2.add("dle");
        l2.add(l.get(i));
        }
        else if(l.get(i).equals("etx"))
        {
        l2.add("dle");
        l2.add(l.get(i));
        }
        else
                l2.add(l.get(i));
}
l2.add("etx");
try
{
FileWriter writer = new FileWriter("v1.txt", true);
BufferedWriter bufferedWriter = new BufferedWriter(writer);
for(int i=0;i<l2.size();i++)
{
	bufferedWriter.write(l2.get(i));
	bufferedWriter.newLine();
}
bufferedWriter.close();
}
catch(IOException e)
{
System.out.println("Exception found!");
}
}
}
