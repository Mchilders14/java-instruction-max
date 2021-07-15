import java.util.Scanner;

public class stoplightApp {

	public static void main(String[] args) {
		msg("Console Application Begin");
		
		//Initialization
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String lightColor;
		boolean rightTurn, obstacle;
		double distance;

		while (choice.equalsIgnoreCase("y")) {
			
			msg("Approaching the intersection, what color is the light?");
			lightColor = sc.next();

			switch (lightColor) {
			
			//Red Light
			case "Red":
				msg("Are you turning right on RED (true/false)?");
				rightTurn = sc.nextBoolean();
				if(rightTurn) {
					msg("Are there any obstacles (true/false)?");
					obstacle = sc.nextBoolean();
					if(obstacle) {
						msg("Please STOP For object!");
					}
					else {
						msg("Please Proceed With Caution!");
					}
				}
				else {
					msg("Please Stop at the RED Light!");
				}
				break;
				
			case "red":
				msg("Are you turning right on RED (true/false)?");
				rightTurn = sc.nextBoolean();
				if(rightTurn) {
					msg("Are there any obstacles (true/false)?");
					obstacle = sc.nextBoolean();
					if(obstacle) {
						msg("Please STOP For object!");
					}
					else {
						msg("Please Proceed With Caution!");
					}
				}
				else {
					msg("Please Stop at the RED Light!");
				}
				break;
				
			//Yellow Light
			case "Yellow":
				msg("What is relative distance to interesection (meters)?");
				distance = sc.nextDouble();
				if(distance <= 30.0) {
					msg("Stomp on the Gas");
				}
				else {
					msg("Please SLOW DOWN to STOP at the Light!");
				}
				break;
				
			case "yellow":
				msg("What is relative distance to interesection (meters)?");
				distance = sc.nextDouble();
				if(distance <= 30.0) {
					msg("Stomp on the Gas");
				}
				else {
					msg("Please SLOW DOWN to STOP at the Light!");
				}
				break;
				
			//Green Light
			case "Green":
				msg("Are there an obsticles the Drive Path (true/false)?");
				obstacle = sc.nextBoolean();
				if(obstacle) {
					msg("Please STOP For object!");
				}
				else {
					msg("Please Proceed With Caution!");
				}
				break;
				
			case "green":
				msg("Are there an obsticles the Drive Path (true/false)?");
				obstacle = sc.nextBoolean();
				if(obstacle) {
					msg("Please STOP For object!");
				}
				else {
					msg("Please Proceed With Caution!");
				}
				break;
			}
			
			//loop repeat
			msg("Do you want to continue (y/n)?");
			choice = sc.next();

		}

		sc.close();
		msg("Console Application End");
	}

	private static void msg(String string) {
		System.out.println(string);
	}
}
