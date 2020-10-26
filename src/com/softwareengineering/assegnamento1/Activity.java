package com.softwareengineering.assegnamento1;

import java.util.ArrayList;
import java.util.List;

/**
 * Enum {@code ActivityType} defines the two main types of activities.
 */
enum ActivityType 
{
	/**
	 * Identifies a course.
	 */
	COURSE,
	
	/**
	 * Identifies a competition.
	 */
	COMPETITION
}

/**
 * The {@code Activity} class defines the behavior of an activity. <p>
 * It specifies name, type and member list and  involves methods to manage them
 */
public class Activity 
{
	
	private String name;
	private List<Member> memberList= new ArrayList<Member>();
	private ActivityType type;
	
	/**
	 * Class constructor.
	 * @param name the name of the activity.
	 * @param type type of the activity. It can be either a course or a competition.
	 */
	
	public Activity(String name,ActivityType type) 
	{
		this.name = name;
		this.type = type;
		Logger.log(Level.INFO, "Creating Activity: %s", this.toString());

	}
	
	/**
	 * Getter for the name of the activity.
	 * @return the activity's name.
	 */
	public String getName() 
	{
		return name;
	}
	
	/**
	 * Setter for the name of the activity.
	 * @param name name of the activity
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Getter for the list of members enrolled in the activity.
	 * @return the list of members enrolled.
	 */

	public List<Member> getMemberList()
	{
		return memberList;
	}
	
	/**
	 * Getter for the activity type.
	 * @return type of activity.
	 */
	
	public ActivityType getType()
	{
		return type;
	}
	
	/**
	 * Setter for the activity type.
	 * @param type type of the activity
	 */

	public void setType(ActivityType type) 
	{
		this.type = type;
	}
	
	/**
	 * Allows a member to join the activity.
	 * This member will be added to the memberList.
	 * @param m the member who wants to enroll to the activity.
	 */
	
	public void enroll(Member m)
	{
		Logger.log(Level.INFO, "Enrolling %s in Activity: %s", m.toString(), this.toString());
		memberList.add(m);
	}
	
	/**
	 * Prints the list of members enrolled in an activity.
	 */
	
	public void printMemberList() 
	{
		System.out.println("Lista iscritti a: "+getName());
		for (Member m: memberList) 
		{
			System.out.println(m);
		}
	}
	
	/**
	 * Allows a member to unsubscribe from the activity. <p>
	 * This method removes the member from the memberList. 
	 * @param m the member who wants to leave the activity.
	 */
	
	public void remove(Member m) 
	{
		Logger.log(Level.INFO, "Removing %s in Activity: %s", m.toString(), this.toString());
		memberList.remove(m);
	}
	
	/**
	 * Returns a textual representation of the activity.
	 * @return the activity's name and its type (course or competition) 
	 */
	
	public String toString()
	{
		return this.name +" ("+this.type.toString()+")";
	}
	
	/**
	 * Returns a full textual representation of the activity including members.
	 * @return the activity's name, its type (course or competition) and the enrolled members.
	 */
	public String fullInfo()
	{
		String res = this.name +" ("+this.type.toString()+")\n";
		for(Member m: memberList)
		{
			res+=m.toString();
			res+='\n';
		}
		return res;
	}
	
	
}
