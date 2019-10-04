package com.github.appreciated.collection.demo.ironcollapse;


import com.github.appreciated.collection.demo.ironcollapse.demo.IronCollapseExample;
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
@Route("iron-collapse/")
@BodySize(height = "100%", width = "100%")
public class IronCollapseDemo extends DemoHelperView {

    public IronCollapseDemo() {
        super(new GithubUrl("https://github.com/appreciated/iron-collapse"), new GithubDependencies("https://github.com/PolymerElements/iron-collapse"));
        withHorizontalHeader("Iron Collapse",
                "A Component that allows to show and hide Content",
                "./frontend/images/ironcollapse/logo.png")
                .withDevice(new IPadMiniView(new IronCollapseExample()).withOrientation(Orientation.PORTRAIT), "Clicking on the Button opens/closes the IronCollapse")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("iron-collapse")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add IronCollapse to your View",
                        new CodeExample(IronCollapseExample.class)
                )
                .withDependencyNotice();
    }

}
