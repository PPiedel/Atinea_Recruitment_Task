public class Application {
    public static void main(String[] args) {
        int minimalAmountOfPosters = runProgram("pla.in");
        System.out.println(minimalAmountOfPosters);
        Util.writeResultToFile(minimalAmountOfPosters);
    }

    public static int runProgram(String path) {
        Building[] buildings = Util.readBuildingsFromPath(path);
        Painter painter = new Painter();
        return painter.getMinimalAmountOfPosters(buildings);
    }
}
