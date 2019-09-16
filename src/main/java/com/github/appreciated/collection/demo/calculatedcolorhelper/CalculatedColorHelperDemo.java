package com.github.appreciated.collection.demo.calculatedcolorhelper;


import com.github.appreciated.collection.demo.calculatedcolorhelper.demo.CalculatedColorHelperExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;

@Push
@Route("calculated-color-helper/")
@BodySize(height = "100%", width = "100%")
public class CalculatedColorHelperDemo extends DemoHelperView {

    public CalculatedColorHelperDemo() {
        withVerticalHeader("Calculated Color Helper",
                "This addon was created to get/set the value of a css variable in a specific scope",
                "./frontend/images/colorhelper/logo.png"
        ).withDevice(new TabletView(new CalculatedColorHelperExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("calculated-color-helper")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add CalculatedColorHelper to your View",
                        new CodeExample(CalculatedColorHelperExample.class)
                );
    }
}
