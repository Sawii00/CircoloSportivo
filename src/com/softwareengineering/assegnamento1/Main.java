package com.softwareengineering.assegnamento1;

/**
 * Main class. <p>
 * It runs a simulation of the club. <p>
 * The system has been written in a way that makes it portable to an interactive console application.<p>
 * Having a login system allows us to quickly set up the UI for user interaction and directly act on the club based on the privilege. <p>
 * Each time a user needs to perform operations, he has to login first. <p>
 * Each operation is logged onto the log.txt file. <p>
 * An initial set of users and activities are created inside the Club Constructor.
 * */
public class Main
{

	public static void main(String[] args)
	{
		

		Logger.createLogger("log.txt");
		
		Club c = new Club();
		
		c.login("admin@club.it", "password");
		
		//Displays the initial member list on the log.txt
		c.operate(Operation.PRINT_MEMBER_LIST); 

		c.operate(Operation.ADD_MEMBER, new Member("Pippo", "Baudo", "p.baudo@club.it", "1111"));
		//Removes user Lorenzo Bianchi
		c.operate(Operation.REMOVE_MEMBER, Club.members.get(2)); 
		//Updates the user Mario Bianchi to Mariotto Bianchi
		c.operate(Operation.UPDATE_MEMBER_NAME, Club.members.get(2), "Mariotto");
		c.logout();
		c.login("p.baudo@club.it", "1111");
		//Pippo Baudo enrolls into Nuoto && 100m Sprint
		c.operate(Operation.ENROLL_ACTIVITY, Club.activities.get(0));
		c.operate(Operation.ENROLL_ACTIVITY, Club.activities.get(1));
		//Pippo Baudo quits from Nuoto
		c.operate(Operation.QUIT_ACTIVITY, Club.activities.get(0));
		c.logout();
		
		c.login("admin@club.it", "password");
		//The logger is open, it prints on log.txt
		c.operate(Operation.PRINT_ACTIVITY_LIST);
		c.operate(Operation.PRINT_MEMBER_LIST);

		Logger.close();
		//The logger is closed, it prints on the standard output
		c.operate(Operation.PRINT_ACTIVITY_LIST);
		c.operate(Operation.PRINT_MEMBER_LIST);
		c.logout();
	}
		
		
	
}
