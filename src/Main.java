import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner tara =new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");
        int number =tara.nextInt();
        int total=0;

        for(int i=1 ; i<number ;i++)
        {

            total=total+i;

        }
        if(total==number)
        {

            System.out.println("Sayi mükemmel sayıdır");

        }
        else {

            System.out.println("Sayi mükemmel sayi degildir");

        }

    }
}
