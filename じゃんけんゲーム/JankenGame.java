import java.util.Random;
import java.util.Scanner;

public class JankenGame{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("===じゃんけんゲーム===");
        System.out.println("0：グー");
        System.out.println("1：チョキ");
        System.out.println("2：パー");
        System.out.println("あなたの手を入力して下さい：");

        int player = scanner.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3);

        System.out.println("コンピューターの手：" + computer);

        if(player == computer){
            System.out.println("あいこ！");
        }else if((player == 0 && computer == 1) ||
                 (player == 1 && computer == 2) ||
                 (player == 2 && computer == 0)) {
                    System.out.println("あなたの勝ち！");
                }else{
                    System.out.println("あなたの負け！");
                }
    }
}