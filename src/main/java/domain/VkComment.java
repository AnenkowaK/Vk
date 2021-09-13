package domain;

import java.time.LocalTime;

public class VkComment {
    private VkComment[] comments;
    private int ownerId;
    private String text;
    private LocalTime dateTime;

    public VkComment[] getComments() {
        return comments;
    }

    public void setComments(VkComment[] comments) {
        this.comments = comments;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalTime dateTime) {
        this.dateTime = dateTime;
    }
}
