import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int right=3;
	int balance = 1500;
	String username1,username = "Kerim";
	String password1,password = "Patika.dev";
	int secim=0;
	Scanner strscanner = new Scanner(System.in);
	Scanner intscanner = new Scanner(System.in);




            do {
                System.out.println("Kullanıcı Adını Giriniz: ");
                username1 = strscanner.next();
                System.out.println("Şifreyi Giriniz: ");
                password1 = strscanner.next();
                if (password1.equals(password) && username1.equals(username)) {
                    do {

                        System.out.println("Hangi işlemi yapmak İstiyorsunuz?\n1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgulama\n4-Çıkış");
                        secim = intscanner.nextInt();
                        switch (secim) {
                            case 1:
                                System.out.println("Var olan tutarınız: "+balance);
                                System.out.println("Ne kadar yatırmak istiyorsunuz?");
                                int yatbakiye = intscanner.nextInt();
                                balance = balance + yatbakiye;
                                System.out.println("Güncel Bakiyeniz: " + balance);
                                break;
                            case 2:
                                System.out.println("Var olan tutarınız: "+balance);
                                System.out.println("Ne Kadar çekmek istiyorsunuz?");
                                int cekbakiye = intscanner.nextInt();
                                balance = balance - cekbakiye;
                                System.out.println("Güncel bakiyeniz: " + balance);
                                break;
                            case 3:
                                System.out.println("Güncel bakiyeniz: " + balance);
                                break;
                            case 4:
                                System.out.println("Çıkışınız Başarılı bir şekilde gerçekleşmiştir.");
                                break;
                            default:
                                System.out.println("Hatalı bir giriş yaptınız.");
                                break;
                        }
                    }while(secim!=4);

                } else {
                    right--;
                    if (right == 0) {
                        System.out.println("Çok fazla hatalı denemeden hesabınız bloke olmuştur. Lütfen bankammızla iletişime geçiniz.");
                        secim = 4;
                    } else {
                        System.out.println("Hatalı kullanıcı adı ya da şifre girdiniz.");
                        System.out.println("Kalan deneme hakkınız: " + right);
                    }
                }
            }while(secim!=4&&right!=0);






    }
}
