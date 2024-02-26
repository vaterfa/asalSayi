public class fibo2 {
    public static void main(String[] args) {
        int fibo=0, fiboTut=1,toplam;

        for (int i = 1; i <= 8; ++i) {
            System.out.print(fibo + " ");
            toplam = fibo + fiboTut;
            System.out.print("+ " + fiboTut + " = " + toplam + "\n");

            fibo = fiboTut;
            fiboTut = toplam;
        }
    }
}