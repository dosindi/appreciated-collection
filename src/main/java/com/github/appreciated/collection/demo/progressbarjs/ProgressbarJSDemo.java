package com.github.appreciated.collection.demo.progressbarjs;


import com.github.appreciated.collection.demo.progressbarjs.demo.CircleProgressbarExample;
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

@Route("progressbar-js/")
@BodySize(height = "100%", width = "100%")
public class ProgressbarJSDemo extends DemoHelperView {

    public ProgressbarJSDemo() {
        super(new GithubUrl("https://github.com/appreciated/progressbar-js"), new GithubDependencies("https://github.com/kimmobrunfeldt/progressbar.js"));
        withHorizontalHeader("ProgressbarJS integration",
                "Allows to present customizable and animated progressbars to the user",
                "./frontend/images/progressbarjs/logo.png")
                .withDevice(new TabletView(new CircleProgressbarExample()).withOrientation(Orientation.PORTRAIT), "Some examples")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("progressbar-js")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .withStep("Code examples", "Add a circular Progressbar to your View",
                        new CodeExample(CircleProgressbarExample.class)
                ).withDependencyNotice();
    }

}
