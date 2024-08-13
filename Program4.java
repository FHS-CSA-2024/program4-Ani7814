//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;
public class program4{
    public static void main(String[] args){
        Scanner numScanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int sum = 0;
        double average = 0.0;
        
        System.out.println("Enter number 1: ");
        num1 = numScanner.nextInt();
        System.out.println("Enter number 2: ");
        num2 = numScanner.nextInt();
        System.out.println("Enter number 3: ");
        num3 = numScanner.nextInt();
        System.out.println("Enter number 4: ");
        num4 = numScanner.nextInt();
        
        sum = num1+num2+num3+num4;
        average = sum/4.0;
        System.out.println("The sum of four numbers is "+sum);
        System.out.println("The average of four numbers is "+average);
        
    
    
    
    
    }
}

//Paste console output below:
/*
Enter number 1: 
475
Enter number 2: 
821
Enter number 3: 
369
Enter number 4: 
562
The sum of four numbers is 2227
The average of four numbers is 556.75


*/
