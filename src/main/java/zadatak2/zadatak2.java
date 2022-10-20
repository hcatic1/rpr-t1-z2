package zadatak2;
import java.util.Scanner;
public class zadatak2 {
    public static void main(String[] args){
        int n;
        System.out.println("Unesite broj: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for(int i = 1; i <= n; i++){
            int suma = sumaCifara(i);
            if(i % suma == 0){
                System.out.println(i);
            }
        }
    }
    public static int sumaCifara(int n){
        int suma = 0;
        while(n != 0){
            suma += n%10;
            n /=10;
        }
        return suma;
    }
}
