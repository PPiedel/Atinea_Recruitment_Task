

import java.io.*;
import java.util.Scanner;

public final class Util {

    private Util() { }

    public static Building[] readBuildingsFromPath(String path) {
        File file = new File(path);
        Scanner scanner = null;
        Building[] buildings = null;
        try {
            scanner = new Scanner(file);
            int size = scanner.nextInt();
            buildings = new Building[size];

            int line = 0;
            while (scanner.hasNext()) {
                int width = scanner.nextInt();
                int height = scanner.nextInt();

                Building building = new Building(width, height);
                buildings[line] = building;
                line++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

        return buildings;
    }
}
