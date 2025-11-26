import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int radius;
        float area;

        radius = Input.readData();

        area = Compute.area(radius);

        Output.display(radius, area);
    }
}