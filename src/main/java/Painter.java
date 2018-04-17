
import java.util.ArrayDeque;
import java.util.Deque;

public class Painter {

    public int getMinimalAmountOfPosters(Building[] buildings) {
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
