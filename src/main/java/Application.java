public class Application {
    public static void main(String[] args) {
        String path = "pla.in";
        runProgram(path);

    }

    public static void runProgram(String path) {
        Building[] buildings = Util.readBuildingsFromPath(path);
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);
        System.out.println(minimalAmountOfPosters);
        Util.writeResultToFile(minimalAmountOfPosters);
    }
}
