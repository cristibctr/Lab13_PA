/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class LocaleExplore {
    private static ResourceBundle resource;
    public static void main(String[] args){
        resource = SetLocale.setLocaleLang("ro");
        Scanner keyboard = new Scanner(System.in);
        String command = "";
        while(!command.equals("quit")){
            System.out.println(resource.getString("prompt"));
            command = keyboard.next();
            switch(command){
                case "locales":
                    DisplayLocales display = new DisplayLocales();
                    display.print(resource);
                    break;
                case "set":
                    String setLocale = keyboard.nextLine().trim();
                    resource = SetLocale.setLocaleLang(setLocale);
                    break;
                case "quit":
                    break;
                default:
                    try{
                        Locale locale = Locale.forLanguageTag(command);
                        Info.infoLocale(locale, resource);
                    }
                    catch (Exception e) {
                        System.out.println(resource.getString("invalid"));
                    }
            }
        }
    }
}
