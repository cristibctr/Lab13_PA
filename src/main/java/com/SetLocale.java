/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author crist
 */
public class SetLocale {
    
    public static ResourceBundle setLocaleLang(String localeArg) {
        Locale locale = new Locale(localeArg);
        System.out.println("Country:" + locale.getCountry());
        System.out.println("Language:" + locale.getLanguage());
        System.out.println("Week Days:" + Arrays.toString(DateFormatSymbols.getInstance(locale).getWeekdays()));
        System.out.println("Months:" + Arrays.toString(DateFormatSymbols.getInstance(locale).getMonths()));
        System.out.println("Today:" + DateFormat.getDateInstance(DateFormat.FULL, locale).format(new Date()));
        return ResourceBundle.getBundle("res.Messages", locale);
    }
    
}
