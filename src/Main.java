import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int [] marks = new int[6];
        float total, avg;
        total = 0;
        Scanner scan = new Scanner(System.in);
        for( int i =0; i < 6; i++){
            System.out.println("Enter results: " +(i+1) +":");
            marks[i] = scan.nextInt();
            total+=marks[i];
        }
        scan.close();

        avg= total/6;
        System.out.println("Student end of year result is: ");
        if(avg>70){
            System.out.println('A');
        } else if (avg>=60&&  avg<=70){
            System.out.println('B');
        } else if (avg>= 40 && avg>=55){
            System.out.println('C');
        } else {
            System.out.println('D');
        }
    }
}
