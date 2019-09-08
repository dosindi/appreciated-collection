package com.github.appreciated.collection.demo.ironoverlaybehavior;


import com.github.appreciated.collection.demo.ironoverlaybehavior.demo.IronOverlayBehaviorExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entity.CodeExample;
import com.github.appreciated.demo.helper.entity.GithubDependencies;
import com.github.appreciated.demo.helper.entity.GithubUrl;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("iron-overlay-behavior/")
@BodySize(height = "100%", width = "100%")
public class IronOverlayBehaviorDemo extends DemoHelperView {

    public IronOverlayBehaviorDemo() {
        super(new GithubUrl("https://github.com/appreciated/iron-overlay-behavior"), new GithubDependencies("https://www.webcomponents.org/element/@polymer/iron-overlay-behavior"));
        withHorizontalHeader("IronOverlayBehavior",
                "Use IronOverlayBehavior to implement an element that can be hidden or shown, and displays on top of other content.",
                "./frontend/images/ripple/logo.png")
                .withDevice(new TabletView(new IronOverlayBehaviorExample()).withOrientation(Orientation.PORTRAIT))
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("iron-overlay-behavior")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add IronOverlayBehavior to your View",
                        new CodeExample(IronOverlayBehaviorExample.class)
                )
                .withDependencyNotice();
    }
}
