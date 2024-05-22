
public class TextBox extends UIControl {
    public String text = " ";

    public TextBox(boolean isEnabled) {
        super(isEnabled);
        System.out.println("Textbox");
    }

    // @Override
    // public void enable() {
    //     System.out.println("Enabled");
    // }

    public void  setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}