public class numbersearch{
public static void main(String[] args){
int[] arr = {10,20,30,40};
int target = 30;
boolean found = false;
for(int n: arr){
if(n==target){
found = true;
break;
}
}
if(found)
System.out.println("Found");
else
System.out.println("Not Found");
}
}