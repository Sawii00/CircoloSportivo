package com.softwareengineering.assegnamento1;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * The Enum {@code Level} defines the logging level for a specific Log Message
 * 
 * */

enum Level
{
	/**
	 * Identifies an informative log message
	 * */
	INFO,
	/**
	 * Identifies a warning log message
	 * */
	WARNING,
	/**
	 * Identifies an error log message
	 * */
	ERROR,
	/**
	 * Identifies a log message with no tag
	 * */
	NO_LEVEL;
};

/**
 * The {@code Logger} class is a logging utility that allows for file logging through
 * static methods. <p>
 * If the logger is not set to a specific file, methods default to writing to the standard output.
 * 
 * */
public class Logger
{

	private static PrintWriter out;
	private static boolean open = false;
	
	
	/**
	 * @return whether the logger is ready to be written to
	 * */
	public static boolean ready()
	{
		return open;
	}
	
	/**
	 * Opens the file for writing. <p>
	 * It closes the current file if already open.
	 * @param fileName the name of the log file
	 * 
	 * */
	
	public static void createLogger(String fileName)
	{
		close();
		
		try
		{
			out = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e)
		{
			System.err.println("FILE NOT FOUND FOR LOGGING");
			return;
		}
		
		open = true;		
		
	}
		
	/**
	 * Logs a specified message to the output log file with the specified level. <p>
	 * If the logger is not set to a specific file, log defaults to writing to the standard output.
	 * 
	 * @param level the logging level (INFO, ERROR, WARNING, NO_LEVEL)
	 * @param msg the message to be logged
	 * 
	 * */
	
	
	public static void log(Level level, String msg)
	{
		if(!open)
		{
			if(level != Level.NO_LEVEL)
				System.out.println(level.toString() + ": "+ msg);
			else 
				System.out.println(msg);
			return;
		}
		
		if(level != Level.NO_LEVEL)
			out.println(level.toString() + ": "+ msg);
		else 
			out.println(msg);
		
	}
	
	/**
	 * Logs a specified message to the output log file with the specified level
	 * through the use of {@code printf}, thus allowing string formatters <p>
	 * If the logger is not set to a specific file, log defaults to writing to the standard output.
	 * @param level the logging level (INFO, ERROR, WARNING, NO_LEVEL)
	 * @param format the format string to be used for the log
	 * @param args variable number of arguments that map to the format string
	 * 
	 * */
	
	
	public static void log(Level level, String format, Object... args)
	{
		if(!open)
		{
			if(level != Level.NO_LEVEL)
				System.out.printf(level.toString() + ": "+ format+"\n", args);
			else
				System.out.printf(format+"\n", args);
			return;
		}
		
		
		if(level != Level.NO_LEVEL)
			out.printf(level.toString() + ": "+ format+"\n", args);
		else
			out.printf(format+"\n", args);

	}
	
	
	/**
	 * Closes the log file if it is open
	 * */
	public static void close()
	{
		if(open)
		{
			out.close();
			open = false;
		}
	}
	


}