package soalLatihan;

import java.util.Scanner;

public class SoalLatihan1 {
    public static void main(String[] args) {
        int bilangan[] = new int[2];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < bilangan.length; i++){
            System.out.print("masukan bilangan ke -" + (i + 1) + " : ");
            bilangan[i] = input.nextInt();
        }

        if(bilangan[0] > bilangan[1]){
            System.out.println(bilangan[0]);
        }else {
            System.out.println(bilangan[1]);
        }

    }
}
