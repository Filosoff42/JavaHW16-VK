package domain.attachment;

public class CategoryMarket {
    private int id;
    private String name;
    private SectionCategoryMarket sectionCategoryMarket;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SectionCategoryMarket getSectionCategoryMarket() {
        return sectionCategoryMarket;
    }

    public void setSectionCategoryMarket(SectionCategoryMarket sectionCategoryMarket) {
        this.sectionCategoryMarket = sectionCategoryMarket;
    }
}
