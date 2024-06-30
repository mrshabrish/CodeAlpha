package Internship;
import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Students : ");
        int size=sc.nextInt();
        int a[]=new int[size];
        int s1=0,s2=0;
        for(int i=0;i<size;i++)
        {
            System.out.printf("Enter Grade of Student "+(i+1)+" : ");
            a[i]=sc.nextInt();
            if(a[i]>100)
            {
                System.out.println("Sorry  sir , marks are exceed more than  100");
                return;
            }
        }
        int lowest=a[0];
        int highest=a[0];
        int sum=a[0];
        for(int i=1;i<size;i++)
        {
            if(a[i]>highest)
            {
                highest=a[i];
                 s1=i;
            }
            if(a[i]<lowest)
            {
                lowest=a[i];
                s2=i;
            }
            sum+=a[i];
        }
        System.out.println("The Average marks of students : "+(sum/size));
        System.out.println("The Highest Grade is : "+highest + " Of Student : "+(s1+1));
        System.out.println("The lowest Grade is : "+lowest+" Of Student : "+(s2+1));

    }
}
