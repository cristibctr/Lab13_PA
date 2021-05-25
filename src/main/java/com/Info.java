/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author crist
 */
public class Info {

    public static void infoLocale(Locale locale, ResourceBundle resource) {
        System.out.println(locale.getDisplayCountry(resource.getLocale()) + "\n" + locale.getDisplayLanguage(resource.getLocale())+ "\n");
    }
    
}
