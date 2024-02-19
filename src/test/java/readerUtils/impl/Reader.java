package readerUtils.impl;

import exceptions.PropertyReaderException;
import readerUtils.AbstractReader;
import readerUtils.ReaderInterface;

public class Reader extends AbstractReader implements ReaderInterface {

    private final static String SUT_PROPERTY_RESOURCE_FILE_LOCATION = "/sut.properties";

    public Reader() throws PropertyReaderException {
        super(SUT_PROPERTY_RESOURCE_FILE_LOCATION);
    }

    @Override
    public String getBaseUrl() {
        return properties.getProperty("baseUrl");
    }

    @Override
    public Long getStandardWaitTime() {
        return Long.parseLong(properties.getProperty("standardWaitTime"));
    }

}
