import java.util.Arrays;
public class shoppingcart
{
public static void main(String[] args)
{
double[] prices = {100,200,300,400,500};
double total = 0;
double highest = prices[0];
int count = 0;
for(double p : prices){
total+=p;
if(p>highest){
highest =p;
}
if(p>1000){
count++;
}
System.out.println("Total price:"+total);
System.out.println("Highest price:"+highest);
System.out.println("product above 1000:"+count);
}
}
}