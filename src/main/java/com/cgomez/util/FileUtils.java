/*
 * Copyright (c) 2015 cgomez. All rights reserved.
 */
package com.cgomez.util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.util.CollectionUtils;

import com.cgomez.exception.DLIOException;
import com.cgomez.util.constant.CErrorException;
import com.cgomez.util.constant.Constant;

/**
 * The Class FileUtils.
 *
 * @author <a href="mailto:andres1537@gmail.com">Carlos A. Gómez</a>
 * @since dl-batch-1.0
 */
public final class FileUtils extends org.apache.commons.io.FileUtils {

    /**
     * Instantiates a new file utils.
     */
    private FileUtils() {
    }

    /**
     * Write to txt file.
     *
     * @param <T> the generic type
     * @param columnNames the column names
     * @param list the list
     * @param outputFile the output file
     * @param separator the separator
     * @throws DLIOException the DLIO exception
     */
    public static <T> void writeToTxtFile(Collection<String> columnNames, Collection<T> list, String outputFile, String separator) throws DLIOException {
	if (!CollectionUtils.isEmpty(list)) {
	    for (T t : list) {
		writeToTxtFile(columnNames, t, outputFile, separator);
	    }  
	}
    }
    
    /**
     * Write header to txt file.
     *
     * @param <T> the generic type
     * @param columnNames the column names
     * @param outputFile the output file
     * @param separator the separator
     * @throws DLIOException the DLIO exception
     */
    public static <T> void writeHeaderToTxtFile(Collection<String> columnNames, String outputFile, String separator) throws DLIOException {
	File file = new File(outputFile);

	try {

	    StringBuffer line = new StringBuffer();
	    Iterator<String> it = columnNames.iterator();
	    while (it.hasNext()) {
		line.append((String) it.next());
		line.append(it.hasNext() ? separator : Constant.EMPTY);
	    }
	    
	    line.append(Constant.NEW_LINE);
	    FileUtils.writeStringToFile(file, line.toString(), StandardCharsets.UTF_8, true);

	} catch (IOException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	    
	} catch (SecurityException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	    
	} catch (IllegalArgumentException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	}
    }
    
    /**
     * Write to txt file.
     *
     * @param <T> the generic type
     * @param columnNames the column names
     * @param t the t
     * @param outputFile the output file
     * @param separator the separator
     * @throws DLIOException the DLIO exception
     */
    public static <T> void writeToTxtFile(Collection<String> columnNames, T t, String outputFile, String separator) throws DLIOException {
	File file = new File(outputFile);

	try {

	    StringBuffer line = new StringBuffer();
	    Field field = null;
	    Iterator<String> it = columnNames.iterator();
	    while (it.hasNext()) {
		field = getField(t, (String) it.next());
		field.setAccessible(true);
		line.append(field.get(t));
		line.append(it.hasNext() ? separator : Constant.EMPTY);
	    }
	    
	    line.append(Constant.NEW_LINE);
	    FileUtils.writeStringToFile(file, line.toString(), StandardCharsets.UTF_8, true);

	} catch (IOException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	    
	} catch (SecurityException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	    
	} catch (IllegalArgumentException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	    
	} catch (IllegalAccessException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	    
	} catch (NoSuchFieldException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	}
    }
    
    /**
     * Write to txt file.
     *
     * @param line the line
     * @param outputFile the output file
     * @throws DLIOException the DLIO exception
     */
    public static void writeToTxtFile(String line, String outputFile) throws DLIOException {
	File file = new File(outputFile);

	try {

	    StringBuffer buffer = new StringBuffer();
	    buffer.append(line);
	    buffer.append(Constant.NEW_LINE);
	    FileUtils.writeStringToFile(file, buffer.toString(), StandardCharsets.UTF_8, true);

	} catch (IOException e) {
	    throw new DLIOException(outputFile, CErrorException.ERR_NOT_FILE_LOADED, e.getCause());
	} 
    }
    
    /**
     * Extract field names.
     *
     * @param <T> the generic type
     * @param t the t
     * @return the collection
     */
    public static <T> Collection<String> extractFieldNames(T t) {
	Collection<String> names = new ArrayList<String>();
	Class<?> current = t.getClass();
	while(current.getSuperclass() != null) { 
	    current = current.getSuperclass();
	    for(Field field : current.getDeclaredFields()) {
		names.add(field.getName());
	    }
	}
	
	for(Field field : t.getClass().getDeclaredFields()) {
	    names.add(field.getName());
	}
	
	return names;
    }
    
    /**
     * Gets the field.
     *
     * @param <T> the generic type
     * @param t the t
     * @param name the name
     * @return the field
     * @throws NoSuchFieldException the no such field exception
     * @throws SecurityException the security exception
     */
    private static <T> Field getField(T t, String name) throws NoSuchFieldException, SecurityException {
	Field field = null;
	Class<?> current = t.getClass();
	
	
	    while(current.getSuperclass() != null && field == null) { 
		current = current.getSuperclass();
		try {
		    field = current.getDeclaredField(name);
		} catch (NoSuchFieldException | SecurityException e) {}
	    }
	
	    if (field == null) {
		field = t.getClass().getDeclaredField(name);
	    }
	
	return field;
    }
}