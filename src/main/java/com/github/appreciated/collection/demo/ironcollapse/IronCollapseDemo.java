package com.github.appreciated.collection.demo.ironcollapse;


import com.github.appreciated.collection.demo.ironcollapse.demo.IronCollapseExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("iron-collapse/")
@BodySize(height = "100%", width = "100%")
public class IronCollapseDemo extends DemoHelperView {

    public IronCollapseDemo() {
        withHorizontalHeader("Iron Collapse",
                "A Component that allows to show and hide Content",
                "./frontend/images/ironcollapse/logo.png")
                .withDevice(new TabletView(new IronCollapseExample()).withOrientation(Orientation.PORTRAIT), "Clicking on the Button opens/closes the IronCollapse")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("iron-collapse")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add IronCollapse to your View",
                        new CodeExample(IronCollapseExample.class)
                );
    }

}
