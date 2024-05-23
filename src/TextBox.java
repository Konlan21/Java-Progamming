
public class TextBox extends UIControl {
    public String text = " ";

    public TextBox() {
        // super(isEnabled);
        System.out.println("Textbox");
    }

    // @Override
    // public void enable() {
    //     System.out.println("Enabled");
    // }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    public void  setText(String text) {
        this.text = text;
    }

    public void clear() {
        text = "";
    }
}