

import java.io.*;
import java.util.Scanner;

public final class Util {
    public static final String OUTPUT_FILE_NAME = "pla.out";

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

    public static void writeResultToFile(int result){
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(OUTPUT_FILE_NAME));
            writer.write(String.valueOf(result));
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            tryToCloseWriter(writer);
        }
    }

    private static void tryToCloseWriter(BufferedWriter writer) {
        if(writer!=null){
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
