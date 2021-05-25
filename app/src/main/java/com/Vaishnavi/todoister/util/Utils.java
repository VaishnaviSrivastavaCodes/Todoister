package com.Vaishnavi.todoister.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
        simpleDateFormat.applyPattern(" EEE , dd MMM ");
        return simpleDateFormat.format(date);
    }
}
