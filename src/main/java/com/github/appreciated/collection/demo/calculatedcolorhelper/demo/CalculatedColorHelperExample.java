package com.github.appreciated.collection.demo.calculatedcolorhelper.demo;

import com.github.appreciated.calc.color.helper.CalculatedColorHelper;
import com.github.appreciated.calc.color.helper.LumoVariables;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;


public class CalculatedColorHelperExample extends VerticalLayout {
    public CalculatedColorHelperExample() {
        TextField fieldPrimaryColor = new TextField(LumoVariables.LUMO_PRIMARY_COLOR);
        TextField fieldTextColor = new TextField(LumoVariables.LUMO_PRIMARY_TEXT_COLOR);
        CalculatedColorHelper helper = new CalculatedColorHelper();

        helper.getCalculatedColor(fieldPrimaryColor::setValue, LumoVariables.LUMO_PRIMARY_COLOR);
        helper.getCalculatedColor(fieldTextColor::setValue, LumoVariables.LUMO_PRIMARY_TEXT_COLOR);

        VerticalLayout testLayout = new VerticalLayout(
                new Label("This box is the scope of the CalculatedColorHelper"),
                new Button("Check my Color"),
                new Checkbox("test", true),
                helper
        );
        testLayout.getStyle().set("border", "1px solid var(--lumo-primary-color)");

        VerticalLayout content = new VerticalLayout(testLayout,
                new HorizontalLayout(
                        fieldPrimaryColor,
                        new Button("Update", event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, fieldPrimaryColor.getValue()))
                ),
                new HorizontalLayout(
                        fieldTextColor,
                        new Button("Update", event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_TEXT_COLOR, fieldTextColor.getValue()))
                ),
                new Label("Note: Any valid css color can be set in the TextFields f.e. \"red\" or \"green\"")
        );
        add(content);
    }
}
