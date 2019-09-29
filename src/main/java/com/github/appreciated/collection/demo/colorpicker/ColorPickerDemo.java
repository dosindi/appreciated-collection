package com.github.appreciated.collection.demo.colorpicker;


import com.github.appreciated.collection.demo.colorpicker.demo.ColorPickerExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Push
@Route("color-picker/")
@BodySize(height = "100%", width = "100%")
public class ColorPickerDemo extends DemoHelperView {

    public ColorPickerDemo() {
        super(new GithubUrl("https://github.com/Juchar/color-picker-flow"), new GithubDependencies("https://github.com/Juchar/color-picker", "https://github.com/thebespokepixel/es-tinycolor"));
        withHorizontalHeader("Color Picker",
                "A Component that allows to pick a color and switch between common color schemas",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(new ColorPickerExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("color-picker-flow")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("A code example", "Add ColorPicker to your View",
                        new CodeExample(ColorPickerExample.class)
                )
                .withContributorNotice()
                .withDependencyNotice();
    }

}
