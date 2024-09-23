package utitlies;

import java.util.Properties;

import static utitlies.PropertiesFileLoader.get_properties;


public class PropertiesManager {

    public static Properties properties;

    //The function that return the properties of the file
    public static Properties getProperty(String name){
        properties = get_properties(name);
        return properties;
    }
}
