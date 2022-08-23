package setups;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigProperties {
    public static Properties property;
    private static final String configPath = "src/test/resources/properties/myProperties.properties";

    public static void initPropertyFile() {
        property = new Properties();
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(configPath));
            property.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
