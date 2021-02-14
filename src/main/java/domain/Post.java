package domain;

import java.util.Calendar;

public class Post {
    private String postId;
    private Author author;
    private Calendar dateAndTime;
    private String postBody;
    private PostFooter postFooter;

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Calendar getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(Calendar dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getPostBody() {
        return postBody;
    }

    public void setPostBody(String postBody) {
        this.postBody = postBody;
    }

    public PostFooter getPostFooter() {
        return postFooter;
    }

    public void setPostFooter(PostFooter postFooter) {
        this.postFooter = postFooter;
    }
}
