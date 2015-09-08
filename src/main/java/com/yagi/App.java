package com.yagi;

import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * Simple App to test IANA Timezone converted using JODA Library
 *
 */
public class App 
{
	private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormat
			.forPattern("yyyy-MM-dd HH:mm");
	
	private String ianaTimeZone;
	private String testedDate;
	
    public String getIanaTimeZone() {
		return ianaTimeZone;
	}

	public void setIanaTimeZone(String ianaTimeZone) {
		this.ianaTimeZone = ianaTimeZone;
	}

	public String getTestedDate() {
		return testedDate;
	}

	public void setTestedDate(String testedDate) {
		this.testedDate = testedDate;
	}

	public static void main( String[] args )
    {
		App app = new App();
		
		// Set IANA Timezone for Australia/Sydney
		app.setIanaTimeZone("Australia/Sydney");
        System.out.println( "Location : " + app.getIanaTimeZone());
        DateTimeZone sydZone = DateTimeZone.forID(app.getIanaTimeZone());
        System.out.println("Date of 2015-10-04 20:00 : " + TIME_FORMATTER.parseDateTime("2015-10-04 20:00").withZone(sydZone));
        System.out.println("Date of 2015-09-30 20:00 : " + TIME_FORMATTER.parseDateTime("2015-09-30 20:00").withZone(sydZone));
        System.out.println("Date of 2015-09-30 20:00 : " + TIME_FORMATTER.parseDateTime("2016-10-02 20:00").withZone(sydZone));
        
        System.out.println("\n ======= \n");
        
        /*
         * IANA Timezone for Australia/Perth
         */
		// Set IANA Timezone for Australia/Perth
		app.setIanaTimeZone("Australia/Perth");
        System.out.println( "Location : " + app.getIanaTimeZone());
        DateTimeZone perthZone = DateTimeZone.forID(app.getIanaTimeZone());
        System.out.println("Date of 2016-10-02 20:00 : " + TIME_FORMATTER.parseDateTime("2016-10-02 20:00").withZone(perthZone));
        System.out.println("Date of 2016-04-01 20:00 : " + TIME_FORMATTER.parseDateTime("2016-04-01 20:00").withZone(perthZone));
        
        System.out.println("\n ======= \n");
        
        /*
         * IANA Timezone for Australia/Melbourne
         */
		// Set IANA Timezone for Australia/Melbourne
		app.setIanaTimeZone("Australia/Melbourne");
        System.out.println( "Location : " + app.getIanaTimeZone());
        DateTimeZone melbourneZone = DateTimeZone.forID(app.getIanaTimeZone());
        System.out.println("Date of 2015-10-04 20:00 : " + TIME_FORMATTER.parseDateTime("2015-10-04 20:00").withZone(melbourneZone));
        System.out.println("Date of 2015-10-03 20:00 : " + TIME_FORMATTER.parseDateTime("2015-10-03 20:00").withZone(melbourneZone));
        
        System.out.println("\n ======= \n");
        
        /*
         * IANA Timezone for Asia/Novosibirsk
         */
		// Set IANA Timezone for Asia/Novosibirsk
		app.setIanaTimeZone("Asia/Novosibirsk");
        System.out.println( "Location : " + app.getIanaTimeZone());
        DateTimeZone novoZone = DateTimeZone.forID(app.getIanaTimeZone());
        System.out.println("Date of 2016-03-01 20:00 : " + TIME_FORMATTER.parseDateTime("2016-03-01 20:00").withZone(novoZone));
        System.out.println("Date of 2016-04-15 20:00 : " + TIME_FORMATTER.parseDateTime("2016-04-15 20:00").withZone(novoZone));
        
        System.out.println("\n ======= \n");
        
        /*
         * IANA Timezone for America/Chicago
         */
		// Set IANA Timezone for America/Chicago
		app.setIanaTimeZone("America/Chicago");
        System.out.println( "Location : " + app.getIanaTimeZone());
        DateTimeZone chicagoZone = DateTimeZone.forID(app.getIanaTimeZone());
        System.out.println("Date of 2016-03-13 20:00 : " + TIME_FORMATTER.parseDateTime("2016-03-13 20:00").withZone(chicagoZone));
        System.out.println("Date of 2016-03-12 20:00 : " + TIME_FORMATTER.parseDateTime("2016-03-12 20:00").withZone(chicagoZone));
        
        System.out.println("\n ======= \n");
        
        /*
         * IANA Timezone for America/Indiana/Indianapolis
         */
		// Set IANA Timezone for America/Indiana/Indianapolis
		app.setIanaTimeZone("America/Indiana/Indianapolis");
        System.out.println( "Location : " + app.getIanaTimeZone());
        DateTimeZone indianaZone = DateTimeZone.forID(app.getIanaTimeZone());
        System.out.println("Date of 2016-03-13 20:00 : " + TIME_FORMATTER.parseDateTime("2016-03-13 20:00").withZone(indianaZone));
        System.out.println("Date of 2016-03-12 20:00 : " + TIME_FORMATTER.parseDateTime("2016-03-12 20:00").withZone(indianaZone));
        
    }
}
