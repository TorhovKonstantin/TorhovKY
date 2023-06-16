package lab10;

public class TitleNews {
    private String title;
    private String publicDate;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public TitleNews(String title, String publicDate) {
        this.title = title;
        this.publicDate = publicDate;
    }
}
