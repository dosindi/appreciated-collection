package com.github.appreciated.collection.demo.calculatedcolorhelper;


import com.github.appreciated.calc.color.helper.CalculatedColorHelper;
import com.github.appreciated.calc.color.helper.LumoVariables;
import com.github.appreciated.collection.maven.DependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("calculated-color-helper/")
@BodySize(height = "100%", width = "100%")
public class CalculatedColorHelperDemo extends DemoHelperView {

    public CalculatedColorHelperDemo() {
        withVerticalHeader("Calculated Color Helper",
                "This addon was created to allow to get/set the value of a css variable in a specific scope",
                "./frontend/images/no-logo.png"
        ).withDevice(new TabletView(getExample()).withOrientation(Orientation.PORTRAIT), "Clicking on the Button opens/closes the IronCollapse")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new DependencyReader("iron-collapse").getDependencyString(), "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add IronCollapse to your View",
                        new CodeExample("TextField fieldPrimaryColor = new TextField(LumoVariables.LUMO_PRIMARY_COLOR);\n" +
                                "TextField fieldTextColor = new TextField(LumoVariables.LUMO_PRIMARY_TEXT_COLOR);\n" +
                                "CalculatedColorHelper helper = new CalculatedColorHelper();\n" +
                                "\n" +
                                "helper.getCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, value -> fieldPrimaryColor.setValue(value));\n" +
                                "helper.getCalculatedColor(LumoVariables.LUMO_PRIMARY_TEXT_COLOR, value -> fieldTextColor.setValue(value));\n" +
                                "\n" +
                                "fieldPrimaryColor.addValueChangeListener(event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, event.getValue()));\n" +
                                "fieldTextColor.addValueChangeListener(event -> helper.setCalculatedColor(\"--lumo-primary-text-color\", event.getValue()));\n" +
                                "\n" +
                                "VerticalLayout testLayout = new VerticalLayout(\n" +
                                "        new Label(\"This box is the scope of the CalculatedColorHelper\"),\n" +
                                "        new Button(\"See my Style\"),\n" +
                                "        new Checkbox(\"test\", true),\n" +
                                "        helper\n" +
                                ");\n" +
                                "testLayout.getStyle().set(\"border\", \"1px solid var(--lumo-primary-color)\");\n" +
                                "\n" +
                                "VerticalLayout content = new VerticalLayout(testLayout,\n" +
                                "        new HorizontalLayout(\n" +
                                "                fieldPrimaryColor,\n" +
                                "                new Button(\"Set\", event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, fieldPrimaryColor.getValue()))\n" +
                                "        ),\n" +
                                "        new HorizontalLayout(\n" +
                                "                fieldTextColor,\n" +
                                "                new Button(\"Set\", event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_TEXT_COLOR, fieldTextColor.getValue()))\n" +
                                "        ),\n" +
                                "        new Label(\"Note: Any valid css color can be set f.e. \\\"red\\\" or \\\"green\\\"\")\n" +
                                ");", "java", "Java")
                );
    }

    private Component getExample() {
        TextField fieldPrimaryColor = new TextField(LumoVariables.LUMO_PRIMARY_COLOR);
        TextField fieldTextColor = new TextField(LumoVariables.LUMO_PRIMARY_TEXT_COLOR);
        CalculatedColorHelper helper = new CalculatedColorHelper();

        helper.getCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, value -> fieldPrimaryColor.setValue(value));
        helper.getCalculatedColor(LumoVariables.LUMO_PRIMARY_TEXT_COLOR, value -> fieldTextColor.setValue(value));

        fieldPrimaryColor.addValueChangeListener(event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, event.getValue()));
        fieldTextColor.addValueChangeListener(event -> helper.setCalculatedColor("--lumo-primary-text-color", event.getValue()));

        VerticalLayout testLayout = new VerticalLayout(
                new Label("This box is the scope of the CalculatedColorHelper"),
                new Button("See my Style"),
                new Checkbox("test", true),
                helper
        );
        testLayout.getStyle().set("border", "1px solid var(--lumo-primary-color)");

        VerticalLayout content = new VerticalLayout(testLayout,
                new HorizontalLayout(
                        fieldPrimaryColor,
                        new Button("Set", event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_COLOR, fieldPrimaryColor.getValue()))
                ),
                new HorizontalLayout(
                        fieldTextColor,
                        new Button("Set", event -> helper.setCalculatedColor(LumoVariables.LUMO_PRIMARY_TEXT_COLOR, fieldTextColor.getValue()))
                ),
                new Label("Note: Any valid css color can be set f.e. \"red\" or \"green\"")
        );
        return content;
    }

}
