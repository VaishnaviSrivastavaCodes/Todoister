package com.Vaishnavi.todoister.util;

import androidx.room.TypeConverter;

import com.Vaishnavi.todoister.model.Priority;

import java.util.Date;

public class Converter {

    @TypeConverter
    public static Date TimestamptoDate(Long value){
    return value == null ? null : new Date(value);

    }
    @TypeConverter
    public static Long DatetoTimestamp(Date date){
        return date == null ? null :date.getTime();

    }

    @TypeConverter
    public static String PriorityToString(Priority priority){
        return priority == null ? null : priority.name();
    }

    @TypeConverter
    public static Priority StringtoPriority(String pri){
        return pri == null ? null : Priority.valueOf(pri);
    }





}
