package soalLatihan;

import java.util.Scanner;

public class SoalLatihan3 {
    public static void main(String[] args) {
        int bilangan[] = new int[2];
        int tipeOperator = 0;
        int sum = 0;
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < bilangan.length; i++){
            System.out.print("masukan bilangan ke -" + (i + 1) + " : ");
            bilangan[i] = input.nextInt();
        }

        System.out.print("masukan tipe operator (1-5)");
        tipeOperator= input.nextInt();

        switch (tipeOperator){
            case 1:
                sum = bilangan[0] + bilangan[1];
                break;
            case 2:
                sum = bilangan[0] - bilangan[1];
                break;
            case 3:
                sum = bilangan[0] * bilangan[1];
                break;
            case 4:
                sum = bilangan[0] / bilangan[1];
                break;
            case 5:
                sum = bilangan[0] % bilangan[1];
                break;
            default:
                System.out.println("Error operator tidak tersedia");
                System.exit(0);
        }

        System.out.println(sum);
    }
}
