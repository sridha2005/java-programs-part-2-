import java.util.Scanner;
public class ladder{
public static void main(String[]  args){
Scanner sc =new Scanner(System.in);
System.out.println("enter username:");
String user = sc.next();
System.out.println("enter password:");
int pass = sc.nextInt();
if(user.equals("admin"))
{
if(pass == 1234)
{
System.out.println("login successful");
}
else{
System.out.println("wrong password");
}
}
else{
System.out.println("Invalid username");
}
}
}