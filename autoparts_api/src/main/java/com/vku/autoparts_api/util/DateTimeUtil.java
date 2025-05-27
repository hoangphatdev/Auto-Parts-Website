package com.vku.autoparts_api.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeUtil {
    public static LocalDateTime formatDateTime(LocalDateTime dateTime){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
        String dateTimeFormatted = formatter.format(dateTime);
        return LocalDateTime.parse(dateTimeFormatted, formatter);
    }

    public static LocalDateTime getDateTime(){
        return LocalDateTime.now();
    }

    public static String getFormattedDateTime(){
        LocalDateTime formattedDateTime = formatDateTime(getDateTime());
        return formattedDateTime.toString();
    }
}
