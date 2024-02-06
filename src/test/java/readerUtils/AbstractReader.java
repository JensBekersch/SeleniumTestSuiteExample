package readerUtils;

import exceptions.PropertyReaderException;
import readerUtils.impl.Reader;

import java.io.IOException;
import java.util.Properties;

public class AbstractReader {

    protected static final Properties properties = new Properties();

    public AbstractReader(String resource) throws PropertyReaderException {
        try {
            properties.load(Reader.class.getResourceAsStream(resource));
        } catch (IOException exception) {
            throw new PropertyReaderException(exception.getMessage());
        }
    }

}
