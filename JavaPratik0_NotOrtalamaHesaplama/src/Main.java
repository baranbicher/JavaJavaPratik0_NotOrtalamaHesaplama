import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner yeniDeger = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunuz:");
        mat = yeniDeger.nextInt();

        System.out.print("Fizik Notunuz:");
        fizik= yeniDeger.nextInt();

        System.out.print("Kimya Notunuz:");
        kimya= yeniDeger.nextInt();

        System.out.print("Türkçe Notunuz:");
        turkce= yeniDeger.nextInt();

        System.out.print("Tarih Notunuz:");
        tarih= yeniDeger.nextInt();

        System.out.print("Müzik Notunuz:");
        muzik= yeniDeger.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        int sonuc = (toplam / 6);

        System.out.println("Not Ortalamnız: " + sonuc);

        System.out.println(sonuc >= 60 ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.");

    }
}