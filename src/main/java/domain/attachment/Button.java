package domain.attachment;

public class Button {
    private String title;
    private ButtonAction buttonAction;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ButtonAction getButtonLinkAction() {
        return buttonAction;
    }

    public void setButtonLinkAction(ButtonAction buttonAction) {
        this.buttonAction = buttonAction;
    }
}
