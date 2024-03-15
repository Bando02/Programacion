import java.util.Scanner;
public class TablaMultiplicar {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
 

    int num;
    int min = 0;
    int max = 10;
    int multi = 1;
    do{
        System.out.println("Introduce un num");
        num = sc.nextInt();
    }   
        while (num < min || num > max );
    do{
        System.out.println(num+" x " +multi +" = " +num * multi);
        multi = multi + 1;
    }
    while(multi < 11);
    
    
    
    }
}