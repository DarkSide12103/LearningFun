package new1;

import java.util.*; //This imports everything in the util folder
public class Tut1 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);    //This is creating a new scanner of the type.
		
		
		String[]myLooks = new String[3]; //This is creating an Array called myLooks
		myLooks[0] = "Brown Eyes"; //This is adding an object to myLooks called Brown Eyes
		myLooks[1] = "Brown Hair";
		myLooks[2] = "And Ears";
		
		boolean learning = true; //This is creating a boolean called learning set to true
		
		
		
		String Me = "Devon"; //This is creating a string called Me set to Devon
		String Progress = "";
		
		
		
		System.out.println("Hello " + Me + "!");   //This prints out Hello Devon!
		System.out.println("You have " + myLooks[0] + ", " + myLooks[1] + ", " + myLooks[2]);
		
		
		if(learning == true) { //This is a simple if else statement, saying that if learning is true, then it will print "You are learning!."
			System.out.println("You are learning!!!");
		}
		else {           //This is a simple else statement.
			System.out.println("You must continue learning ):");	
		}
		
		
		System.out.println("Do you think that you are making progress? Y or N");
		Progress = userInput.nextLine(); //This takes the users input and puts it in Progress.
		
		if(Progress.equals("Y")) {        //IMPORTANT TO use Progress.equals because it is a condition for a string!!
			System.out.println("That's great!");
		}
		else { //This else statement is helping us support the final else, so it must stay nested.
			if(Progress.equals("N")) {
				System.out.println("Keep working and you will succeed (:");
			}
			else { //If the user has entered an incorrect key, the will be prompted with the following message.
				System.out.println("You have entered a incorrect key!"); 
			}
		}
		
		
		
		
		
	}

}
