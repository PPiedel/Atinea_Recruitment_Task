import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;

public class PainterTest {
    @Test
    public void pla0GetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla0.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(4, minimalAmountOfPosters);
    }

    @Test
    public void pla1aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(41, minimalAmountOfPosters);
    }


    @Test
    public void pla1bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(105, minimalAmountOfPosters);
    }

    @Test
    public void pla1cGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1c.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(1, minimalAmountOfPosters);
    }

    @Test
    public void pla1ocenGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1ocen.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(5, minimalAmountOfPosters);
    }

    @Test
    public void pla2aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(718, minimalAmountOfPosters);
    }

    @Test
    public void pla2bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(662, minimalAmountOfPosters);
    }

    @Test
    public void pla2cGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2c.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(4, minimalAmountOfPosters);
    }

    @Test
    public void pla2ocenGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2ocen.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(6, minimalAmountOfPosters);
    }

    @Test
    public void pla3aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(1190, minimalAmountOfPosters);
    }

    @Test
    public void pla3bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(2105, minimalAmountOfPosters);
    }

    @Test
    public void pla3cGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3c.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(1705, minimalAmountOfPosters);
    }

    @Test
    public void pla3ocenGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3ocen.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(7, minimalAmountOfPosters);
    }

    @Test
    public void pla4aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla4a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(2201, minimalAmountOfPosters);
    }

    @Test
    public void pla4bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla4b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(3449, minimalAmountOfPosters);
    }

    @Test
    public void pla4ocenGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla4ocen.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(125001, minimalAmountOfPosters);
    }

    @Test
    public void pla5aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla5a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(105834, minimalAmountOfPosters);
    }

    @Test
    public void pla5bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla5b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(107570, minimalAmountOfPosters);
    }

    @Test
    public void pla6aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla6a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(122285, minimalAmountOfPosters);
    }

    @Test
    public void pla6bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla6b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(130604, minimalAmountOfPosters);
    }

    @Test
    public void pla7aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla7a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(133315, minimalAmountOfPosters);
    }

    @Test
    public void pla7bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla7b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(149362, minimalAmountOfPosters);
    }

    @Test
    public void pla8aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla8a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(112754, minimalAmountOfPosters);
    }

    @Test
    public void pla8bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla8b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(150254, minimalAmountOfPosters);
    }

    @Test
    public void pla9aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla9a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(174118, minimalAmountOfPosters);
    }

    @Test
    public void pla9bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla9b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(148540, minimalAmountOfPosters);
    }

    @Test
    public void pla10aGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla10a.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(159396, minimalAmountOfPosters);
    }

    @Test
    public void pla10bGetMinimAmountOfPostersTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla10b.in").getFile());
        Building[] buildings = Util.readBuildingsFromPath(file.getPath());

        //when
        Painter painter = new Painter();
        int minimalAmountOfPosters = painter.getMinimalAmountOfPosters(buildings);

        //then
        assertEquals(155393, minimalAmountOfPosters);
    }


}