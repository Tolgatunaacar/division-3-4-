import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.println("Bir sayı girin:");
            int k = input.nextInt();
            int x = 0;
            int y = 0;

            for (int i = 1; i<=k; i++){
                if (i%3==0 && i%4==0){
                    System.out.println(i);
                    x = x + i;
                    y++;
                }
            }
            System.out.println(y);
            int ort = x/y;
            System.out.println("Ortalama ="+ort);
    }
}
