package readerUtils.impl;

import exceptions.PropertyReaderException;
import readerUtils.AbstractReader;
import readerUtils.RyanairReaderInterface;

public class RyanairReader extends AbstractReader implements RyanairReaderInterface {

    private final static String RYANAIR_PROPERTY_RESOURCE_FILE_LOCATION = "/locatorConfiguration/ryanair.properties";

    public RyanairReader() throws PropertyReaderException {
        super(RYANAIR_PROPERTY_RESOURCE_FILE_LOCATION);
    }


    @Override
    public String getInputFieldDeparture() {
        return properties.getProperty("inputFieldDeparture");
    }

    @Override
    public String getInputFieldDestination() {
        return properties.getProperty("inputFieldDestination");
    }

    @Override
    public String getSearchButton() {
        return properties.getProperty("searchButton");
    }

    @Override
    public String getText(String text) {
        String property = properties.getProperty("containsText");

        return property.replaceAll("\\{text}", text);
    }

    @Override
    public String getAcceptAllCookiesButton() {
        return properties.getProperty("acceptAllCookiesButton");
    }

    @Override
    public String getDepartureContextMenuCologne() {
        return properties.getProperty("departureContextMenuCologne");
    }
}
