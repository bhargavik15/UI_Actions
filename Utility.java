package ui_actions.com;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

    //Here I call both proprties files

    public static Object fetchPropertValue(String key) throws IOException {
        FileInputStream file = new FileInputStream("config.properties");
        Properties properties = new Properties();
        properties.load(file);
        properties.get(key);
        return properties.get(key);

    }

    public static String fetchLocatorsValue(String key) throws IOException {
        FileInputStream file = new FileInputStream("elements.properties");
        Properties properties = new Properties();
        properties.load(file);
        properties.get(key);
        return properties.get(key).toString();
    }
}
