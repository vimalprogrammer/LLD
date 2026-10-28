import java.nio.file.Path;
import java.util.SortedMap;

public class GoogleMaps {

    private PathCalculator pathCalculator;

    public GoogleMaps(PathCalculator pathCalculator) {
        this.pathCalculator = pathCalculator;
    }

    public void findPath(String source, String dest) {
        pathCalculator.findPath(source,dest);
    }
}
