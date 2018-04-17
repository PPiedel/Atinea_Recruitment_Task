public class Application {
    public static void main(String[] args) {
        int minimalAmountOfPosters = runProgram("pla.in");
    }

    public static int runProgram(String path) {
        Building[] buildings = Util.readBuildingsFromPath(path);
        Painter painter = new Painter();
        return painter.getMinimalAmountOfPosters(buildings);
    }
}
