import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertArrayEquals;

public class UtilTest {

    @Test
    public void readBuildingsFromFile() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla0.in").getFile());
        Building[] expected = new Building[]{
                new Building(1, 2),
                new Building(1, 3),
                new Building(2, 2),
                new Building(2, 5),
                new Building(1, 4)
        };

        //when
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //then
        assertArrayEquals(expected, buildings);

    }
}