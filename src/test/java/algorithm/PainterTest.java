package algorithm;

import model.Building;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PainterTest {

    @Test
    public void getMinimalAmountOfPosters() {
        //given
        Building[] buildings = new Building[]{
                new Building(1, 2),
                new Building(1, 3),
                new Building(2, 2),
                new Building(2, 5),
                new Building(1, 4)
        };

        //when
        Painter painter = new Painter(buildings);

        //then
        assertEquals(4, painter.getMinimalAmountOfPosters());
    }
}