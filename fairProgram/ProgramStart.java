package fairProgram;

import java.util.Scanner;

import fairRides.AmusementRides;
import fairRides.BumperCars;
import fairRides.HauntedHouse;
import fairRides.JumpAndSmile;
import fairRides.MirrorMaze;
import fairRides.TopSpin;
import fairRides.Tornado;

/**
 * Class with the Main Method My program STARTS HERE!
 */
public class ProgramStart {

	public static void main(String[] args) {

		System.out.println("Welcome to the Fair");
		System.out.println("1 BumperCars.\n" + "2 JumpAndSmile. \n" + "3 MirrorMaze.\n" + "4 HauntedHouse.\n"
				+ "5 TopSpin.\n" + "6 Tornado.");
		/*
		 * As soon as you start the program, you will get a menu where you select a ride
		 * if you select the corresponding number a ride should be sold and run 1 for
		 * BumperCars 2 for JumpAndSmile 3 for MirrorMaze 4 for HauntedHouse 5 for
		 * TopSpin 6 for Tornado if you press q the program should terminate
		 */

		Scanner input = new Scanner(System.in);
		AmusementRides rides = new AmusementRides();

		/*
		 * pakt elke keer dubbele run methode bij default pakt hij zowel default als die
		 * van de laatste valid run die is uitgevoerd
		 */
		while (true) {
			String choice = input.nextLine();
			switch (choice) {
			case "1":
				rides = new BumperCars();
				rides.Run();
				rides.Sell();
				break;
			case "2":
				rides = new JumpAndSmile();
				rides.Run();
				rides.Sell();
				break;
			case "3":
				rides = new MirrorMaze();
				rides.Run();
				rides.Sell();
				break;
			case "4":
				rides = new HauntedHouse();
				rides.Run();
				rides.Sell();
				break;
			case "5":
				rides = new TopSpin();
				rides.Run();
				rides.Sell();
				break;
			case "6":
				rides = new Tornado();
				rides.Run();
				rides.Sell();
				break;
			case "q":
				System.out.println("the Fair has closed, thanks for your visit!");
				input.close();
				System.exit(0);
				break;
			default:
				System.out.println("Ride not availible, choose again please");
				break;

			}
			/*
			 * rides.Run(); rides.Sell(); these lines are commented out because they gave
			 * the double out print line in other words they are redundent
			 */
		}
	}
}
