package algorithmsandconstructs;

public final class FeedItem {

    public final String title;
    public final String content;

    public FeedItem(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Title=" + title + "\nContent=" + content;
    }
    
    

}
