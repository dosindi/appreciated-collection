package com.github.appreciated.collection.demo.papercolor;


import com.github.appreciated.collection.demo.papercolor.demo.PaperColorExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-color/")
@BodySize(height = "100%", width = "100%")
public class PaperColorDemo extends DemoHelperView {

    public PaperColorDemo() {
        withHorizontalHeader("Paper Color",
                "A color picker Component based on l2t-paper-color",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(new PaperColorExample()).withOrientation(Orientation.PORTRAIT), "Choose some colors")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("paper-color").getDependencyString(), Language.markup, "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add Paper Color to your View",
                        new CodeExample(PaperColorExample.class)
                );
    }
}
