package domain.attachment;

public class Market {
    private String type = "market";
    private int id;
    private int ownerId;
    private String title;
    private String description;
    private PriceMarket priceMarket;
    private DimensionsMarket dimensionsMarket;
    private int weight;
    private CategoryMarket categoryMarket;
    private String thumbPhoto;
    private int date;
    private int availability;
    private boolean isFavorite;
    private String sku;
    private boolean extended;
    private boolean canComment;
    private boolean canRepost;
    private LikesInfo likesInfo;
    private String url;
    private String buttonTitle;

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PriceMarket getPriceMarket() {
        return priceMarket;
    }

    public void setPriceMarket(PriceMarket priceMarket) {
        this.priceMarket = priceMarket;
    }

    public DimensionsMarket getDimensionsMarket() {
        return dimensionsMarket;
    }

    public void setDimensionsMarket(DimensionsMarket dimensionsMarket) {
        this.dimensionsMarket = dimensionsMarket;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public CategoryMarket getCategoryMarket() {
        return categoryMarket;
    }

    public void setCategoryMarket(CategoryMarket categoryMarket) {
        this.categoryMarket = categoryMarket;
    }

    public String getThumbPhoto() {
        return thumbPhoto;
    }

    public void setThumbPhoto(String thumbPhoto) {
        this.thumbPhoto = thumbPhoto;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean isExtended() {
        return extended;
    }

    public void setExtended(boolean extended) {
        this.extended = extended;
    }

    public boolean isCanComment() {
        return canComment;
    }

    public void setCanComment(boolean canComment) {
        this.canComment = canComment;
    }

    public boolean isCanRepost() {
        return canRepost;
    }

    public void setCanRepost(boolean canRepost) {
        this.canRepost = canRepost;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getButtonTitle() {
        return buttonTitle;
    }

    public void setButtonTitle(String buttonTitle) {
        this.buttonTitle = buttonTitle;
    }
}
