package genericsClassChallenge;

public class Main {
    public static void main(String[] args) {
        var nationalUsParks = new Park[] {
            new Park("Yellowstone", "44.4882, -110.5916"),
            new Park("Grand Canyon", "36.1085, -112.0965"),
            new Park("Yosemite", "37.8855, -119.5360"),
        };

        Layer<Park> parkLayer = new Layer<>(nationalUsParks);
        parkLayer.renderLayer();

        var majorUsRivers = new River[] {
                new River("Mississippi", "47.2160, -95.2348", "29.1566, -89.2495",
                        "35.1556, -90.0659"),
                new River("Missouri", "45.9482, -111.4983", "38.8146, -90.11218"),
        };

        Layer<River> riverLayer = new Layer<>(majorUsRivers);
        riverLayer.renderLayer();
    }
}