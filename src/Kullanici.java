import java.util.Scanner;

/**
 * @author Ayşe Memiş
 * @since 1.0.0
 */
public class Kullanici {
    public static void main(String[] args) {

        String userName, passWord;


        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = inp.nextLine();

        System.out.print("Şifreniz:");
        passWord = inp.nextLine();

        if (userName.equals("ayse") && passWord.equals("kurt123")) {
            System.out.println("Giriş yaptınız!");


        } else{
            System.out.println("Yanlış şifre girdiniz!");
            System.out.println("Şifrenizi sıfırlamak ister misiniz?");
           int evet = 1;
           int hayir = 2;
            System.out.println("1=evet");
            System.out.println("2=hayır");
            System.out.println("Seçiminiz");
            int select = inp.nextInt();
            inp.nextLine();

            switch (select){
                case 1 :
                    System.out.println("Yeni bir şifre giriniz.");
                    System.out.println("Yeni şifreniz:");
                    String newPassword = inp.nextLine();

                    if ( newPassword.equals("kurt123")){
                        System.out.println("Eski şifrenizden farklı bir şifre giriniz.");
                    }else {
                        System.out.println("Şifreniz değiştirildi.");
                    }
                    break;
                case 2:
                    System.out.println("Sistemden çıkış yapınız.");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız.");
            }




        }
    }
}
