import java.util.Scanner;

public class TotalSalary {
    public static void main (String [] args){
        Scanner s = new Scanner (System.in);
        int BasicSalary = s.nextInt();
        char c = s.next().charAt(0);
        
        double hra = (20.0/100) * BasicSalary; // 0.2 * BasicSalary
        double da = (50.0/100) * BasicSalary; // 0.5 * BasicSalary
        double pf = (11.0/100)* BasicSalary; // 0.11 * BasicSalary
        int allow;
        if (c == 65){
            allow = 1700;
        }else if (c == 66){
            allow = 1500;
        }else{
            allow = 1300;
        }
        double totalsalary =(BasicSalary + hra + da + allow - pf);
        System.out.println(Math.round(totalsalary));   
    }
}
