package base;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);
    static double conversion = 0.09290304;

    public static void main(String[] args) {
        App myApp = new App();
        room myRoom = new room();
        myApp.getInput(myRoom);

        int sqrFT = myApp.getSquareFeet(myRoom);
        double sqrMeter = myApp.getSquareMeters(sqrFT);

        myApp.printOutput(sqrFT, sqrMeter);
    }

    public void printOutput(int sqrFT, double sqrMeter) {
        System.out.printf("The area is \n%d square feet\n%.3f square meters", sqrFT, sqrMeter);
    }

    public double getSquareMeters(int sqrFeet) {
        return sqrFeet * conversion;
    }

    public int getSquareFeet(room room) {
        return (room.length * room.width);
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
