package com.api.idiomas.utils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/**
 * Utils class.
 * @author Rodrigo Capri Margarido
 * @version 1.0
 */

public class Utils {

	/**
	 * Decodes a string using UTF-8.
	 * 
	 * @param text - String to be decoded.
	 * @return The decoded string.
	 */
    public static String decodeParam(String text) { //Metodo para retornar a string decodificado
		try {
			return URLDecoder.decode(text, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
	/**
	 * Converts a string in "yyyy-MM-dd" format to a Date object.
	 * 
	 * @param textDate - String to be converted.
	 * @param defaultValue - Default date to be returned if conversion fails.
	 * @return The converted Date object or the default value if conversion fails.
	 */
	public static Date convertDate(String textDate, Date defaultValue) { //Metodo para converter string em data
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		try {
			return sdf.parse(textDate);
		} catch (ParseException e) {
			return defaultValue;
		}
	}

}
