import java.util.Scanner;

public class hesap {
    public static void main(String[] args) {
        System.out.print("1-toplama\n2-cikarma\n3-carpma\n4-bolme\n");
        Scanner scanner=new Scanner(System.in);
        System.out.print("birinci sayiyi girin=");
        int sayi1=scanner.nextInt();
        System.out.print("ikinci sayiyi girin=");
        int sayi2=scanner.nextInt();
        System.out.print("işlemi seçin=");
        int secim=scanner.nextInt();
        switch (secim){
            case 1: System.out.print("toplam= "+(sayi1+sayi2));
            break;
            case 2: System.out.print("çıkarma= "+(sayi1-sayi2));
                break;
            case 3: System.out.print("çarpım= "+(sayi1*sayi2));
                break;
            case 4: System.out.print("bölüm= "+(sayi1/sayi2));
                break;
            default: System.out.print("yanlış seçim yaptınız");
        }
    }
}
