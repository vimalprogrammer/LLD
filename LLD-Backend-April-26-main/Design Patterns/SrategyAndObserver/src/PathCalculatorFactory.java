import java.nio.file.Path;

public class PathCalculatorFactory {

    public static PathCalculator getPathCalculator(String mode) {
        if(mode.equalsIgnoreCase("car")) return new CarPathCalculator();
        else if(mode.equalsIgnoreCase("walk")) return new WalkPathCalculator();
        else if(mode.equalsIgnoreCase("nimbus")) return new NimbusPathCalculator();
        return null;
    }

}
