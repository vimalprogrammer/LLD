import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mode =  sc.next();
        PathCalculator pathCalculator = PathCalculatorFactory.getPathCalculator(mode);
        GoogleMaps map = new GoogleMaps(pathCalculator);

        map.findPath("Noida","Gurgaon");
    }
}
