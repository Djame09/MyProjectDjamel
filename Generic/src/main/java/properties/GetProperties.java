package properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class GetProperties {
    public static Properties loadProperty() {
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\resources\\conig.properties");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return properties;
    }
}



