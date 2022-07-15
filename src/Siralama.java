import java.util.Scanner;
import java.util.Arrays;
public class Siralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz : ");
        int diziLength = input.nextInt();

        System.out.println("Dizi elemanlarini girininiz : ");

        int list[] = new int[diziLength];
        for(int i = 0; i<diziLength; i++){
            System.out.println(i + ". elemani giriniz : ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println("Siralanmis dizi : " + Arrays.toString(list));
    }
}
