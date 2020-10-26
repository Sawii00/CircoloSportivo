package com.softwareengineering.assegnamento1;
import java.util.*;

/**
 * The {@code Club} defines the container for the management of a sport club. <p>
 * 
 * The lists {@code members} and {@code activities} contain current members and activities. <p>
 * It allows a member to log in and perform operations within the club.
 * */

public class Club 
{
	
	static List<Member> members=new ArrayList<Member> ();
	static List<Activity> activities=new ArrayList<Activity> ();
	
	/**
	 * Member currently logged in.
	 * */
	Member currentMember = null;
	
	/**
	 * Class constructor. <p>
	 * 
	 * It defines a set of default users and activities.
	 * */
	
	public Club()
	{
		Logger.log(Level.INFO, "Creating initial set of members and activities\n");
		members.add(new Admin("Default", "Admin", "admin@club.it", "password"));
		members.add(new Member("Marco", "Rossi", "m.rossi@club.it", "password123"));
		members.add(new Member("Lorenzo", "Bianchi", "l.bianchi@club.it", "password1212"));
		members.add(new Member("Mario", "Bianchi", "m.bianchi@club.it", "password1234"));
		
		activities.add(new Activity("Nuoto", ActivityType.COURSE));
		activities.add(new Activity("100m Sprint", ActivityType.COMPETITION));
		activities.add(new Activity("Boxe", ActivityType.COURSE));	
	}
	
	/**
	 *Allows a user to perform an operation. <p>
	 *Members will not have access to many operations. A warning logging message will be displayed in case they try to perform unauthorized operations.
	 *@param op type of operation
	 *@param args parameters required by the operation 
	 * */
	public void operate(Operation op, Object... args)
	{
		if(currentMember == null)
		{
			Logger.log(Level.ERROR, "No user is logged in... cannot perform request");
			return;
		}
		
		switch(op)
		{
		case ADD_MEMBER:
		{
			if(args.length == 1 && args[0] instanceof Member )
				currentMember.addMember((Member)args[0]);
			break;
		}
		case REMOVE_MEMBER:
		{
			if(args.length == 1 && args[0] instanceof Member)
				currentMember.removeMember((Member)args[0]);
			break;
		}
		case UPDATE_MEMBER:
		{
			if(args.length == 2 && args[0] instanceof Member && args[1] instanceof Member)
				currentMember.updateMember((Member)args[0], (Member)args[1]);
			break;
		}
		case UPDATE_MEMBER_NAME:
		{
			if(args.length == 2 && args[0] instanceof Member && args[1] instanceof String)
				currentMember.updateMemberName((Member)args[0], (String)args[1]);
			break;
		}
		case UPDATE_MEMBER_SURNAME:
		{
			if(args.length == 2 &&args[0] instanceof Member && args[1] instanceof String)
				currentMember.updateMemberName((Member)args[0], (String)args[1]);
			break;
		}
		case UPDATE_MEMBER_EMAIL:
		{
			if(args.length == 2 &&args[0] instanceof Member && args[1] instanceof String)
				currentMember.updateMemberName((Member)args[0], (String)args[1]);
			break;
		}
		case UPDATE_MEMBER_PWD:
		{
			if(args.length == 2 &&args[0] instanceof Member && args[1] instanceof String )
				currentMember.updateMemberName((Member)args[0], (String)args[1]);
			break;
		}
		case UPDATE_ACTIVITY:
		{
			if(args.length == 2 &&args[0] instanceof Activity && args[1] instanceof Activity)
				currentMember.updateActivity((Activity)args[0], (Activity)args[1]);
			break;
		}
		case UPDATE_ACTIVITY_NAME:
		{
			if(args.length == 2 &&args[0] instanceof Activity && args[1] instanceof String)
				currentMember.updateActivityName((Activity)args[0], (String)args[1]);
			break;
		}

		case UPDATE_ACTIVITY_TYPE:
		{
			if(args.length == 2 &&args[0] instanceof Activity && args[1] instanceof ActivityType)
				currentMember.updateActivityType((Activity)args[0], (ActivityType)args[1]);
			break;
		}

		case ADD_ACTIVITY:
		{
			if(args.length == 1 &&args[0] instanceof Activity)
				currentMember.createActivity((Activity)args[0]);
			break;
		}

		case REMOVE_ACTIVITY:
		{
			if(args.length == 1 &&args[0] instanceof Activity)
				currentMember.removeActivity((Activity)args[0]);
			break;
		}

		case PRINT_MEMBER_LIST:
		{
			currentMember.printMemberList();
			break;
		}
		case PRINT_ACTIVITY_LIST:
		{
			currentMember.printActivityList();
			break;
		}
		case ENROLL_ACTIVITY:
		{
			if(args.length == 1 &&args[0] instanceof Activity)
				currentMember.enrollActivity((Activity)args[0]);
			break;
		}
		case QUIT_ACTIVITY:
		{
			if(args.length == 1 &&args[0] instanceof Activity)
				currentMember.quitActivity((Activity)args[0]);
			break;
		}
		
		default:
			break;
		
		
		}
		
	}
	
	/**
	 * Allows the login of a specific user. <p>
	 * If a user is already logged in, the method logs him out first.
	 * 
	 * @param email user's email
	 * @param password user's password
	 * */
	
	public void login(String email, String password)
	{
		if(currentMember != null)
		{
			logout();
		}
		
		for(Member m: members)
		{
			if(m.getEmail() == email && m.getPassword() == password)
			{
				currentMember = m;
				return;
			}	
			
		}
	
		
	}
	
	/**
	 * Performs the user's log out if currently logged in.
	 * */
	
	public void logout()
	{
		if(currentMember != null)
			Logger.log(Level.INFO,  "Member %s is logging out", currentMember.toString());
		else
			Logger.log(Level.INFO,  "No member is logged in");

		currentMember = null;
	}
	
	
	
}
