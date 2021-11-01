
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import algorithmsandconstructs.FeedFactoryInterface;
import algorithmsandconstructs.FeedInterface;
import algorithmsandconstructs.FeedItem;

// This line will give you an error until you create the needed class.
import algorithmsandconstructs.FeedFactory;

public class FeedReader {

    public static void main(String[] args) throws IOException {

        // This will produce an error until you create your own class
        // FeedFactory and fix the import at line 7 
        FeedFactoryInterface factory = new FeedFactory();

        String file = "test.rss";
        BufferedReader in = new BufferedReader(new FileReader(file));

        FeedInterface feed = factory.createFeed(in);
        
        feed.addItem(new FeedItem("THE END OF THE WORLD", "It hasn't happened yet"));
        
        System.out.println("=== News titles ===");
        for (String title : feed.listTitles()) {
            System.out.println(title);
        }       
        
        System.out.println("=== Item with title NEW PANDEMIC ===");
        System.out.println(feed.getItem("NEW PANDEMIC"));
        
        System.out.println("=== Number of items ===");
        System.out.println(feed.numItems());        
        
        System.out.println("=== News with the word covid in them ===");
        for (FeedItem item : feed.findItems("covid")) {
            System.out.println(item);
        }

    }
}
