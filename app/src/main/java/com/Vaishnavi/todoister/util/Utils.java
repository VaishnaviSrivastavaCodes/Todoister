package com.Vaishnavi.todoister.util;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.Vaishnavi.todoister.model.Priority;
import com.Vaishnavi.todoister.model.Task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    public static String formatDate(Date date) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) SimpleDateFormat.getDateInstance();
        simpleDateFormat.applyPattern(" EEE , dd MMM ");
        return simpleDateFormat.format(date);
    }

    public static void hideSoftKeyboard(View view) {
        InputMethodManager inm = (InputMethodManager) view.getContext().getSystemService(
                Context.INPUT_METHOD_SERVICE);
        inm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static int priorityColor(Task task) {

        int color;
        if(task.priority == Priority.HIGH){
        color = Color.argb(255 ,255,0,0);
        }
        else if(task.priority == Priority.MEDIUM){
            color = Color.argb(255,204,204,0);
        }
        else{
            color = Color.argb(255,19,169,255);
        }
        return color;
    }
}
