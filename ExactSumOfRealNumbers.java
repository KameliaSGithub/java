import java.io.InputStream;
import java.util.Scanner;
import java.math.BigDecimal;;
public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < n1; i++){
            BigDecimal number = scanner.nextBigDecimal();
            sum = sum.add(number);
        }

        System.out.println(sum);
    }
}
