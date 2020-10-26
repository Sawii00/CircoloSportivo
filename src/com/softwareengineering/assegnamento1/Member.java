package com.softwareengineering.assegnamento1;

/**
 * The {@code Member} class defines a generic member of the club <p>
 *  It can: <p>
 * - Can subscribe to an activity. <p>
 * - Can unsubcribe from an activity.
 */


public class Member extends Person
{
	
	/**
	 * Class constructor. <p>
	 * Invokes the parent {@code Person}'s constructor. 
 	 * @see Person

	 * @param name of the member
	 * @param surname of the member
	 * @param email of the member
	 * @param password of the member
	 */
	
	public Member(String name, String surname, String email, String password)
	{
		super(name, surname, email, password);
		Logger.log(Level.INFO, "Creating Member: %s, %s, %s, %s", name, surname, email, password);
	}

	/**
	 * Prints the list of club members to the logger.<p>
	 * Only an Admin can access the member list. <p>
	 * (NOTE: this list is different from the list of the members that are enrolled
	 * in an activity because this involves <strong> all </strong> the club members).
	 */
	public void printMemberList()
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Prints the list of activities to the logger. <p>
	 * Only an Admin can access the activity list.
	 */
	public void printActivityList()
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());	
	}
	
	/**
	 * Allows a member to sign up for an activity. <p>
	 * @param a the activity to which the member wants to subscribe.
	 */
	public void enrollActivity(Activity  a) 
	{
		Logger.log(Level.INFO, "Enrolling in Activity: %s", a.toString());
		a.enroll(this);
	}
	
	/**
	 * Allows a member to unsubscribe from an activity. <p>
	 * @param a the activity from which the member wants to unsubscribe.
	 */
	public void quitActivity(Activity a)
	{
		Logger.log(Level.INFO, "Quitting Activity: %s", a.toString());
		a.remove(this);
	}

	/**
	 * Allows to swap an old activity with a new one. <p>
	 * Only an Admin can change activities. <p>
	 * @param oldActivity the activity that will be changed. <p>
	 * @param newActivity the activity that will be set.
	 */
	public void updateActivity(Activity oldActivity, Activity newActivity)
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to swap an old member with a new one. <p>
	 * Only an Admin can change member.
	 * @param oldMember the member that will be changed.
	 * @param newMember the member that will be set.
	 */
	public void updateMember(Member oldMember, Member newMember) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());

	}
	
	/**
	 * Allows to create a new activity. <p>
	 * This activity will be added to the activityList. <p>
	 * Only an Admin can create activities.
	 * @param a the activity that will be created.
	 */
	public void createActivity(Activity a) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to delete an activity <p>
	 * This activity will be removed from the activityList. <p>
	 * Only an Admin can remove an activity.
	 * @param a the activity that will be removed.
	 */
	public void removeActivity(Activity a) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to add a new member. <p>
	 * This member will be added to the memberList. <p>
	 * Only an Admin can add a member.
	 * @param m the member who will be added.
	 */
	public void addMember(Member m) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to remove a member. <p>
	 * This member will be removed from the memberList. <p>
	 * Only an Admin can remove a member.
	 * @param m the member who will be removed.
	 */
	public void removeMember(Member m) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to change the member's email. <p>
	 * Only an Admin can edit member's data.
	 * @param m the member whose email will be set.
	 * @param email the email that will be set.
	 */
	public void updateMemberEmail(Member m, String email) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to change the member's name. <p>
	 * Only an Admin can edit member's data.
	 * @param m the member whose name will be set.
	 * @param name the name that will be set.
	 */
	public void updateMemberName(Member m, String name) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to change the members's surname. <p>
	 * Only an Admin can edit member's data.
	 * @param m the member whose surname will be set.
	 * @param surname the surname that will be set.
	 */
	public void updateMemberSurname(Member m, String surname) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to change the member's password. <p>
	 * Only an Admin can edit member's data.
	 * @param m the member whose password will be set.
	 * @param password the password that will be set.
	 */
	public void updateMemberPassword(Member m, String password) 
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to change the activity's name. <p>
	 * Only an Admin can edit activity's data.
	 * @param a the activity.
	 * @param name the activity's name that will be set.
	 */
	public void updateActivityName(Activity a, String name)
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
	
	/**
	 * Allows to change the type of activity (from course to competition
	 * and viceversa). <p>
	 * Only an Admin can edit activity's data.
	 * @param a the activity.
	 * @param type the new type that will be set.
	 */
	public void updateActivityType(Activity a, ActivityType type)
	{
		Logger.log(Level.WARNING, "Member %s is not authorized to perform the current operation.", this.toString());
	}
}
