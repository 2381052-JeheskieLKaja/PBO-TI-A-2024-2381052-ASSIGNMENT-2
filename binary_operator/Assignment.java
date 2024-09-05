package binary_operator;

public class Assignment {
    public static void main(String[] args) {
        //Operator binary_operator.Assignment Dasar
        int angka = 10;
        String nama = "Alice";

        System.out.println("Nilai angka : " + angka);
        System.out.println("Nilai nama : " + nama);

        //Operator binary_operator.Assignment Aritmatika
        int x = 5;
        x += 3; // x = x + 3;
        System.out.println("Nilai x setelah += 3: " + x);

        int y = 10;
        y -= 2; // y = y -2
        System.out.println("Nilai x setelah -= 2: " + y);

        int z = 4;
        z *= 4; //z = z * 4
        System.out.println("Nilai z setelah *= 5: " + z);

        int a = 20;
        a /= 4; // a = a / 4
        System.out.println("Nilai a setelah /= 4 " + a);

        int b = 13;
        b %= 5; //b = b % 5
        System.out.println("Nilai b setelah %= 5: " + b);

    }
}
