import java.io.*;  
class EvenOdd
{  
public static void main(String args[])throws IOException  

{  
InputStreamReader read =new InputStreamReader(System.in);
BufferedReader in =new BufferedReader (read);
double a;
System.out.println("Enter the Number- ");  
a=Double.parseDouble(in.readLine());  
if (a%2==0)
System.out.println("The number is even ");
else if (a%2==1) 
System.out.println("The number is odd");  
else
System.out.println("The number is a decimal"); 
}  
}  

