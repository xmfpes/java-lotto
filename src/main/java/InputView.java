import java.util.Scanner;

public class InputView {
    static Scanner scanner = new Scanner(System.in);

    public static int getInputPrice() {
        System.out.println("구입금액을 입력해 주세요.");
        return scanner.nextInt();
    }

    public static String getWinningLottoText() {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        scanner.nextLine();
        return scanner.nextLine();
    }
}
