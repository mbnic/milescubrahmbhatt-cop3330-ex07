package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        room myRoom = new room();
        myApp.getInput(myRoom);

    }

    public void getInput(room room) {
        System.out.printf("What is the length of the room in feet? ");
        String length = in.nextLine();
        room.length = Integer.parseInt(length);

        System.out.printf("What is the width of the room in feet? ");
        String width = in.nextLine();
        room.width = Integer.parseInt(width);

        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");
    }
}
