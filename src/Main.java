import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("white");
        colors.add("blue");
        System.out.println(colors);
        System.out.println(colors.get(1));

        Scanner sc = new Scanner(System.in);
        String color = "";

        while (true) {
            System.out.print("Please enter a new color (q to quit): ");
            color = sc.next();
            if (color.equalsIgnoreCase("Q")) {
                break;
            }
            colors.add(color);
        }

        System.out.println(colors);
    }
}
