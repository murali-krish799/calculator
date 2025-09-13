package cm.krishsolutions.propertyEditor;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class IntegerPropertyEditor extends PropertyEditorSupport {


    @Override
    public String getAsText() {
        return super.getAsText();
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        System.out.println("inside setAsText...");


        boolean b = (text.matches("^[0-9]+$")) ? true : false;

        if(b){
            setValue(text);

        }else
            setValue(null);
    }
}
