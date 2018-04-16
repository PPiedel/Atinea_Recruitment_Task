package algorithm;

import model.Building;

import java.util.ArrayDeque;
import java.util.Deque;

public final class Painter {

    private final Building[] buildings;

    public Painter(Building[] buildings) {
        this.buildings = buildings;
    }

    public int getMinimalAmountOfPosters() {
        int minimalAmountOfPosters = 0;
        Deque<Building> posterStack = new ArrayDeque<>();

        for (Building currentPoster : buildings) {
            while (!posterStack.isEmpty() && posterStack.getFirst().getHeight() > currentPoster.getHeight()) {
                posterStack.removeFirst();
            }

            if (posterStack.isEmpty() || posterStack.getFirst().getHeight() < currentPoster.getHeight()) {
                posterStack.addFirst(currentPoster);
                minimalAmountOfPosters++;
            }
        }

        return minimalAmountOfPosters;
    }

}
