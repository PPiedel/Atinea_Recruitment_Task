
import java.util.ArrayDeque;
import java.util.Deque;

public class Painter {

    public int getMinimalAmountOfPosters(Building[] buildings) {
        int minimalAmountOfPosters = 0;
        Deque<Building> buildingStack = new ArrayDeque<>();

        for (Building currentBuilding : buildings) {
            while (!buildingStack.isEmpty() && buildingStack.getFirst().getHeight() > currentBuilding.getHeight()) {
                buildingStack.removeFirst();
            }

            if (buildingStack.isEmpty() || buildingStack.getFirst().getHeight() < currentBuilding.getHeight()) {
                buildingStack.addFirst(currentBuilding);
                minimalAmountOfPosters++;
            }
        }

        return minimalAmountOfPosters;
    }

}
