/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ichat.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author zhangjie
 */
public class DateUtils {
    
    public String getHM(){
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("HH:mm");
        return df.format(date);
    }
}
