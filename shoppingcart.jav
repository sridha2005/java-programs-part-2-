import java.util.Arrays;
public class shoppingcart
{
public static void main(String[] args)
{
int [] prices = {100,200,300,400,500};
int max = marks[0];
int sum = 0;
int count = 0;
for(int p:prices){
sum +=p;
if(p > max){
max=p;
}
if(p>1000){
count++;
}
}
System.out.println("Highest price:" + max);
System.out.println("total price:" + sum);
System.out.println("products above 1000:"+ count);
}
}