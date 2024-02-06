package readerUtils;

import exceptions.PropertyReaderException;
import readerUtils.impl.Reader;

public interface ReaderInterface {

    static Reader createReader() throws PropertyReaderException {
        return new Reader();
    }

    String getBaseUrl();

}
