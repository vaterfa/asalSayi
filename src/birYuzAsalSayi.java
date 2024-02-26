package birYuzAsalSayi;

public class birYuzAsalSayi {

    public static void main(String[] args) {

        double modHesap;
        int asalKontrol;

        for (double i=2 ; i<=100 ; i++) {
            asalKontrol=0;
            for (double j=2 ; j<=i ; j++) {

                if (i%j!=0) asalKontrol=asalKontrol+1;

            }
            if (asalKontrol==i-2) System.out.print(i+" ");
        }
    }
}