import java.util.Scanner;

public class Qe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String amPm = scanner.nextLine();
        int hour = scanner.nextInt();

        System.out.println(String.format("%s, %d시", amPm, hour));
    }
}
