import java.util.Scanner;

public class StudentGrade
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Total number of subjects:");
        int n=scanner.nextInt();
        int marks[] = new int[n];
        int i;
        float total=0, avg;
		for(i=0; i<n; i++) 
		{ 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        System.out.println("Total marks:"+total);
        avg =total/n;
        System.out.println("Average:"+(int)avg);
        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}