import java.util.Scanner;;
public class EnglishNameLastD {
    public static String EnglishNameLastD(int number) {
        Scanner scanner = new Scanner(System.in);
        int lastD = Math.abs(number % 10); // same value with positive every time -9.9 -> math.abs= 9.9
        switch (lastD) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(EnglishNameLastD(number));
        scanner.close();
    }
}
