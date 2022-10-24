import java.util.Scanner;
/*
 * KDV Tutarı Hesaplayan Program
 * Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve
 * KDV tutarını hesaplayıp ekrana bastıran programı yazın.
 * (Not : KDV tutarını 18% olarak alın)
 * KDV'siz Fiyat = 10;
 * KDV'li Fiyat = 11.8;
 * KDV tutarı = 1.8;
 * Ödev
 * Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 ,
 *  tutar 1000 TL'den büyük ise KDV oranını %8 olarak
 *  KDV tutarı hesaplayan programı yazınız.
 * */
public class Main {
    public static void main(String[] args) {
        double para,kdv1 = 0.18, kdv2 =0.08, kdvTutari,kdvLi;
        Scanner input = new Scanner(System.in);
        System.out.println("Para değerini giriniz : ");
        para = input.nextDouble();
        System.out.println("KDV'siz Miktar : " + para);
        kdvTutari = 0<para && para<=1000? (para*kdv1):(para*kdv2);
        kdvLi = para + kdvTutari;
        System.out.println("1000 TL'ye kadar KDV oranı : " +kdv1);
        System.out.println("1000 TL'den sonra KDV oranı : " + kdv2);
        System.out.println("KDV Tutarı : " + kdvTutari);
        System.out.println("KDV'li Fiyat : " + kdvLi);
    }
}
