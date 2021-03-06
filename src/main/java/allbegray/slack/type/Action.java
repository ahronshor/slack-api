package allbegray.slack.type;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by allbegray on 2016-10-24.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Action {

    enum Style {
        _default, primary, danger;
    }

    public Action() {
    }

    public Action(String name, String text, String type) {
        this.name = name;
        this.text = text;
        this.type = type;
    }

    protected String name;
    protected String text;
    protected String type;
    protected String value;
    protected Style style = Style._default;
    protected Confirm confirm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Confirm getConfirm() {
        return confirm;
    }

    public void setConfirm(Confirm confirm) {
        this.confirm = confirm;
    }
}
