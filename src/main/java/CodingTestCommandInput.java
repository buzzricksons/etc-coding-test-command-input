import java.util.Scanner;

public class CodingTestCommandInput {
    public static void main(String[] args) {

        // scanner 선언
        Scanner scanner = new Scanner(System.in);

        // 사용자 입력
        System.out.println("문자열을 입력하세요 : ");
        String str = scanner.nextLine();

        System.out.println("정수를 입력하세요 : ");
        int number = scanner.nextInt();

        System.out.println("실수를 입력하세요 : ");
        float floatNumber = scanner.nextFloat();

        System.out.println("true/false를 입력하세요 : ");
        boolean bool = scanner.nextBoolean();

        // 결과 출력
        System.out.println(str);
        System.out.println(number);
        System.out.println(floatNumber);
        System.out.println(bool);

        // close scanner
        scanner.close();
    }
}
