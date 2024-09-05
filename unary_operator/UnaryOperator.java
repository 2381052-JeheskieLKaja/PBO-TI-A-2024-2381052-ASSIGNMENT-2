package unary_operator;

public class UnaryOperator {
    public static void main(String[] args) {
        int x = 10;
        boolean benar = true;

        // Minus dan plus Operator
        System.out.println(-x);
        System.out.println(+x);

        //Pre - Increment
        System.out.println("PRE-INCREMENT : TAMBAH DULU BARU CETAK");
        System.out.println("x awal : " + x);
        System.out.println("++x : " + ++x);
        System.out.println("setelah x : " + x);

        //Post Increment
        System.out.println("POST-INCREMENT : CETAK DULU BARU DITAMBAHIN");
        System.out.println();
        System.out.println();
        System.out.println();

        //Boolean
        System.out.println("value variable !benar : " + !benar);
    }
}
