package input.controller;

import java.util.Scanner;

public class InputController
{
	private Scanner myInput;
	
	public InputController()    
	{
		myInput = new Scanner(System.in);
	}
	
	public void start()
	{
		questions();
		questions();
	}
	
	private void questions()
	{
		System.out.println("Hey, what is yo name son? Give me a nice LOOONG name.");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Your name is " + input + "? That's Stupid.");
		System.out.println("Type a better name please:");
		String fullName = myInput.nextLine();
		System.out.println("So, they call you " + fullName);
		System.out.println("How old are you " + fullName);
		int myAge = myInput.nextInt();
		System.out.println("Well " + fullName + " you are ancient. " + myAge + " Years old.");
	}
}
