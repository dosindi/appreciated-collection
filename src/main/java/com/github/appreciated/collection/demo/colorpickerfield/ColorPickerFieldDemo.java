package com.github.appreciated.collection.demo.colorpickerfield;


import com.github.appreciated.collection.demo.colorpickerfield.demo.ColorPickerFieldExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.IPadMiniView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Push
@Route("color-picker-field/")
@BodySize(height = "100%", width = "100%")
public class ColorPickerFieldDemo extends DemoHelperView {

    public ColorPickerFieldDemo() {
        super(new GithubUrl("https://github.com/Juchar/color-picker-field-flow"), new GithubDependencies("https://github.com/Juchar/color-picker-field", "https://github.com/Juchar/color-picker-flow"));
        withHorizontalHeader("Color Picker Field",
                "A Component that allows to pick a color in an Input field and switch between common color schemas",
                "./frontend/images/no-logo.png")
                .withDevice(new IPadMiniView(new ColorPickerFieldExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("color-picker-field-flow")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("A code example", "Add ColorPickerField or a ColorPickerFieldRaw to your View",
                        new CodeExample(ColorPickerFieldExample.class)
                )
                .withContributorNotice()
                .withDependencyNotice();
    }

}
