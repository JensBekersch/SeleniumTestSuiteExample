package readerUtils;

import exceptions.PropertyReaderException;
import readerUtils.impl.RyanairReader;

public interface RyanairReaderInterface {

    static RyanairReader createRyanairReader() throws PropertyReaderException {
        return new RyanairReader();
    }

    String getInputFieldDeparture();
    String getInputFieldDestination();
    String getSearchButton();
    String getText(String text);
    String getAcceptAllCookiesButton();
    String getDepartureContextMenuCologne();
}
