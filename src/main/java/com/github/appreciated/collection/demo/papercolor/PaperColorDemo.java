package com.github.appreciated.collection.demo.papercolor;


import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.papercolor.PaperColorPicker;
import com.github.appreciated.papercolor.PaperColorPickerAdvanced;
import com.github.appreciated.papercolor.textfield.PaperColorAdvancedTextField;
import com.github.appreciated.papercolor.textfield.PaperColorTextField;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-color/")
@BodySize(height = "100%", width = "100%")
public class PaperColorDemo extends DemoHelperView {

    public PaperColorDemo() {
        withHorizontalHeader("Paper Color",
                "A color picker Component based on l2t-paper-color",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(getExample()).withOrientation(Orientation.PORTRAIT), "Choose some colors")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample("<dependency>\n" +
                                "    <groupId>com.github.appreciated</groupId>\n" +
                                "    <artifactId>paper-color</artifactId>\n" +
                                "    <version>0.7</version>\n" +
                                "</dependency>", "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add Paper Color to your View",
                        new CodeExample("PaperColorTextField field = new PaperColorTextField();\n" +
                                "PaperColorAdvancedTextField advancedTextField = new PaperColorAdvancedTextField();\n" +
                                "PaperColorPicker picker = new PaperColorPicker();\n" +
                                "PaperColorPickerAdvanced pickerAdvanced = new PaperColorPickerAdvanced();", "java", "Java")
                );
    }

    private Component getExample() {
        PaperColorTextField field = new PaperColorTextField();
        PaperColorAdvancedTextField advancedTextField = new PaperColorAdvancedTextField();
        PaperColorPicker picker = new PaperColorPicker();
        PaperColorPickerAdvanced pickerAdvanced = new PaperColorPickerAdvanced();
        return new VerticalLayout(field, advancedTextField, picker, pickerAdvanced);
    }
}
