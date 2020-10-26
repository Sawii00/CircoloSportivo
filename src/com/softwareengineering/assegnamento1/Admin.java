package com.softwareengineering.assegnamento1;

/**
 * The {@code Admin} class defines a member of the club with increased privileges <p>
 * It can: <p>
 * - Can add and remove an activity. <p>
 * - Can add and remove a member. <p>
 * - Can update member's data (name, email and password) <p>
 * - Can set the type of activity (course or competition).
 */

public class Admin extends Member{
	
	/**
	 * Class constructor. <p>
	 * Invokes the parent {@code Member}'s constructor. 
	 * @see Member
	 * 
	 * @param name name of the admin
	 * @param surname surname of the admin
	 * @param email email of the admin
	 * @param password password of the admin
	 */
	public Admin(String name, String surname, String email, String password) 
	{
		super(name, surname, email, password);
	}
	
	
	/**
	 * {@inheritDoc}
	 * */
	public void printMemberList()
	{
		Logger.log(Level.NO_LEVEL, "\n");
		Logger.log(Level.INFO, "Printing member list\n");
		for(Member m: Club.members)
		{
			Logger.log(Level.NO_LEVEL, m.toString());
		}
		Logger.log(Level.NO_LEVEL, "\n");
	
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void printActivityList()
	{
		Logger.log(Level.NO_LEVEL, "\n");
		Logger.log(Level.INFO, "Printing activity list\n");
		for(Activity a: Club.activities)
		{
			Logger.log(Level.NO_LEVEL, a.fullInfo());
		}
		Logger.log(Level.NO_LEVEL, "\n");

	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateActivity(Activity oldActivity, Activity newActivity) 
	{
		Logger.log(Level.INFO, "Updating %s with %s", oldActivity.toString(), newActivity.toString());
		Club.activities.set(Club.activities.indexOf(oldActivity), newActivity);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateMember(Member oldMember, Member newMember) 
	{
		Logger.log(Level.INFO, "Updating %s with %s", oldMember.toString(), newMember.toString());
		Club.members.set(Club.members.indexOf(oldMember), newMember);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void createActivity(Activity a) 
	{
		Logger.log(Level.INFO, "Admin %s is creating Activity %s", this.toString(), a.toString());
		Club.activities.add(a);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void removeActivity(Activity a) 
	{
		Logger.log(Level.INFO, "Admin %s is removing Activity %s", this.toString(), a.toString());
		Club.activities.remove(a);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void addMember(Member m) 
	{
		Logger.log(Level.INFO, "Admin %s is adding Member %s", this.toString(), m.toString());
		Club.members.add(m);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void removeMember(Member m) 
	{
		Logger.log(Level.INFO, "Admin %s is removing Member %s", this.toString(), m.toString());
		Club.members.remove(m);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateMemberEmail(Member m, String email) 
	{
		Logger.log(Level.INFO, "Admin %s is updating the email of Member %s with %s", this.toString(), m.toString(), email);
		m.setEmail(email);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateMemberName(Member m, String name) 
	{
		Logger.log(Level.INFO, "Admin %s is updating the name of Member %s with %s", this.toString(), m.toString(), name);
		m.setName(name);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateMemberSurname(Member m, String surname) 
	{
		Logger.log(Level.INFO, "Admin %s is updating the surname of Member %s with %s", this.toString(), m.toString(), surname);
		m.setSurname(surname);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateMemberPassword(Member m, String password) 
	{
		Logger.log(Level.INFO, "Admin %s is updating the password of Member %s with %s", this.toString(), m.toString(), password);
		m.setPassword(password);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateActivityName(Activity a, String name)
	{
		Logger.log(Level.INFO, "Admin %s is updating the name of Activity %s with %s", this.toString(), a.toString(), name);
		a.setName(name);
	}
	
	/**
	 * {@inheritDoc}
	 * */
	public void updateActivityType(Activity a, ActivityType type)
	{
		Logger.log(Level.INFO, "Admin %s is updating the type of Activity %s with %s", this.toString(), a.toString(), type.toString());
		a.setType(type);
	}
	
}
