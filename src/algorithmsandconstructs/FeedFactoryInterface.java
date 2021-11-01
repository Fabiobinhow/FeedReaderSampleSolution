package algorithmsandconstructs;

import java.io.BufferedReader;
import java.io.IOException;

public interface FeedFactoryInterface {

    /**
     * This method must use a buffered reader passed in when called, and create
     * the instance of the feed class Remember that the Feed class must
     * implement the FeedInterface interface
     *
     * @param in of the type bufferedReader
     * @return an instance of your feed class
     * @throws IOException
     */
    public FeedInterface createFeed(BufferedReader in) throws IOException;

}
