import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertTrue;

public class ApplicationTest {
    public static final int MAX_TIME = 5000;

    @Test
    public void pla0TimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla0.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla1aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla1bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla1cTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1c.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla1ocenTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla1ocen.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla2aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla2bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla2cTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2c.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla2ocenTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla2ocen.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla3aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla3bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla3cTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3c.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla3ocenTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla3ocen.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla4aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla4a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla4bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla4b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla4ocenTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla4ocen.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla5aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla5a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla5bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla5b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla6aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla6a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla6bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla6b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla7aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla7a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla7bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla7b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla8aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla8a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla8bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla8b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla9aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla9a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla9bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla9b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla10aTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla10a.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }

    @Test
    public void pla10bTimeTest() {
        //given
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("in/pla10b.in").getFile());

        //when
        long start = System.currentTimeMillis();
        Application.runProgram(file.getPath());
        long time = System.currentTimeMillis() - start;

        //then
        assertTrue(time <= MAX_TIME);
    }


}