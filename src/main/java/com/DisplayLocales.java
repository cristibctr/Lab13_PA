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
public class DisplayLocales {
    Locale available[];
    public DisplayLocales() {
        available = Locale.getAvailableLocales();
    }
    
    public void print(ResourceBundle resource){
        System.out.println(resource.getString("locales"));
        for(Locale loc : available){
            System.out.println(loc.getDisplayCountry(resource.getLocale()) +" | "+ loc.getDisplayLanguage(resource.getLocale()));
        }
    }
}
