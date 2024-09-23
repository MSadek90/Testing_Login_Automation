package utitlies;

import java.io.*;
import java.util.Properties;

public class PropertiesFileLoader {


       public static Properties properties = new Properties();

        public static Properties get_properties(String fileName) {
        try {
            FileInputStream file = new FileInputStream(fileName);
            properties.load(file);
        }
        catch (IOException e) {
            throw new RuntimeException(fileName + " not found");
        }
        return properties;
        }
}


