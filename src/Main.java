import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Double Measurment = 0.0;
        Double Miles = 0.0;
        Double Feet = 0.0;
        Double Inches = 0.0;
        String trash = "";
        boolean done = false;
        do
        {
            System.out.print("Enter your value in meters : ");
            if(in.hasNextDouble())
            {
                Measurment = in.nextDouble();
                in.nextLine();
                done = true;
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Your entry " + trash + " is invalid ");
            }

        }while (!done);
        Miles = (0.0006213 * Measurment);
        Feet = 3.28 * Measurment;
        Inches = 39.37 * Measurment;
        System.out.println("The Measurment in Meters " + Measurment + " in Miles " + Miles);
        System.out.println("The Measurment in Meters " + Measurment + " in Feet " + Feet);
        System.out.println("The Measurment in Meters " + Measurment + " in inches " + Inches);
    }
}