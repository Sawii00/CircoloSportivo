package com.softwareengineering.assegnamento1;


/**
 * The Enum {@code Operation} identifies the type of operation that a generic user can try to perform. 
 * */

public enum Operation
{
	/**
	 * Identifies the add member operation
	 * */
	ADD_MEMBER,
	/**
	 * Identifies the remove member operation 
	 * */
	REMOVE_MEMBER,
	/**
	 * Identifies the update member operation
	 * */
	UPDATE_MEMBER,
	/**
	 * Identifies the update member name operation
	 * */
	UPDATE_MEMBER_NAME,
	/**
	 * Identifies the update member surname operation
	 * */
	UPDATE_MEMBER_SURNAME,
	/**
	 * Identifies the update member email operation
	 * */
	UPDATE_MEMBER_EMAIL,
	/**
	 * Identifies the update member password operation                                                      
	 * */
	UPDATE_MEMBER_PWD,
	/**
	 * Identifies the update activity operation
	 * */
	UPDATE_ACTIVITY, 
	/**
	 * Identifies the update activity name operation
	 * */
	UPDATE_ACTIVITY_NAME,
	/**
	 * Identifies the update activity type operation
	 * */
	UPDATE_ACTIVITY_TYPE,
	/**
	 * Identifies the add activity operation
	 * */
	ADD_ACTIVITY, 
	/**
	 * Identifies the remove activity operation
	 * */
	REMOVE_ACTIVITY, 
	/**
	 * Identifies the print member list operation
	 * */
	PRINT_MEMBER_LIST, 
	/**
	 * Identifies the print activity list operation
	 * */
	PRINT_ACTIVITY_LIST, 
	/**
	 * Identifies the enroll activity operation
	 * */
	ENROLL_ACTIVITY, 
	/**
	 * Identifies the quit activity operation
	 * */
	QUIT_ACTIVITY
};
