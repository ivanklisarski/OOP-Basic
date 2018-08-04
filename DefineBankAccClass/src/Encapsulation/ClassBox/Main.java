package Encapsulation.ClassBox;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                double l = Double.parseDouble(reader.readLine());
                double w = Double.parseDouble(reader.readLine());
                double h = Double.parseDouble(reader.readLine());



        Box box = new Box(l,w,h);
        System.out.printf("Surface Area - %.2f\n",box.surfaceArea(l, w, h));
        System.out.printf("Lateral Surface Area - %.2f\n",box.LatheralSurfaceArea());
        System.out.printf("Volume - %.2f\n",box.Volume(l, w, h));
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
    }
}
