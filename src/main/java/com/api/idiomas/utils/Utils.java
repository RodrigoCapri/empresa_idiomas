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

	/**
	 * Formats a CPF number.
	 * 
	 * @param cpf - CPF number to be formatted.
	 * @return The formatted CPF number.
	 * @throws IllegalArgumentException if the CPF number is invalid.
	 */
	public static String formataCpf(String cpf) {

		if (cpf.length() != 11) 
			throw new IllegalArgumentException("Cpf inválido");

		return String.format("%s.%s.%s-%s", cpf.substring(0, 3), cpf.substring(3, 6), cpf.substring(6, 9), cpf.substring(9, 11));
	}

	
	/**
	 * Formats a cellular number.
	 * 
	 * @param celular - Cellular number to be formatted.
	 * @return The formatted cellular number.
	 * @throws IllegalArgumentException if the cellular number is invalid.
	 */
	public static String formataCelular(String celular) {

		if (celular.length() != 11) 
			throw new IllegalArgumentException("Celular inválido");

		return String.format("(%s) %s-%s", celular.substring(0, 2), celular.substring(2, 6), celular.substring(6, 11));
	}

	/**
	 * Formats a cep number.
	 * 
	 * @param cep - Cep number to be formatted.
	 * @return The formatted cep number.
	 * @throws IllegalArgumentException if the cep number is invalid.
	 */
	public static String formataCep(String cep) {

		if (cep.length() != 8)	
			throw new IllegalArgumentException("Cep inválido");

		return String.format("%s-%s", cep.substring(0, 5), cep.substring(5, 8));
	}

}
