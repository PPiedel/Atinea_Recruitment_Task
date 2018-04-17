import java.util.Objects;

public class Building {
    private int width;
    private int height;

    public Building(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return width == building.width &&
                height == building.height;
    }

    @Override
    public int hashCode() {

        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Building{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
