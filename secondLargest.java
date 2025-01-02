import java.util.*;
public class secondLargest
{
public static void main(String args[]) 
{
System.out.println("PROGRAM FOR FINDING THE SECOND HIGHEST NUMBER IN AN ARRAY");
System.out.println("\nENTER THE SIZE OF THE ARRAY");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
for (int i = 0; i< n; i++) 
{
arr[i] = sc.nextInt();
}
int secondLargest = findSecondLargest(arr);
System.out.println("The Second Highest Number is "+ secondLargest);
}
static int findSecondLargest(int[] arr)
{
int max=Integer.MIN_VALUE;
int secondMax=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
if(max<arr[i])
{					
secondMax=max;
max=arr[i];
}
else if(secondMax<arr[i])
{
secondMax=arr[i];
}
}
return(secondMax);
}
}