package coordinate.view;

import java.util.Scanner;

public class InputView {
    static Scanner sc = new Scanner(System.in);

    public static String getLocation() {
        System.out.println("좌표를 입력하세요.");
        return sc.nextLine();
    }
}