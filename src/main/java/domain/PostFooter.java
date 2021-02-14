package domain;

public class PostFooter {
    private String footerId;
    private boolean likeIs;
    private int likeNumber;
    private boolean canComment;
    private int commentNumber;
    private boolean canShare;
    private int shareNumber;
    private int viewsNumber;

    public String getFooterId() {
        return footerId;
    }

    public void setFooterId(String footerId) {
        this.footerId = footerId;
    }

    public boolean isLikeIs() {
        return likeIs;
    }

    public void setLikeIs(boolean likeIs) {
        this.likeIs = likeIs;
    }

    public int getLikeNumber() {
        return likeNumber;
    }

    public void setLikeNumber(int likeNumber) {
        this.likeNumber = likeNumber;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public boolean isCanShare() {
        return canShare;
    }

    public void setCanShare(boolean canShare) {
        this.canShare = canShare;
    }

    public int getShareNumber() {
        return shareNumber;
    }

    public void setShareNumber(int shareNumber) {
        this.shareNumber = shareNumber;
    }

    public int getViewsNumber() {
        return viewsNumber;
    }

    public void setViewsNumber(int viewsNumber) {
        this.viewsNumber = viewsNumber;
    }
}
