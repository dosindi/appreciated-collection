package com.github.appreciated.collection.demo.paperripple;


import com.github.appreciated.collection.demo.component.ExampleContent;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.ripple.PaperRippleVerticalLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-ripple/")
@BodySize(height = "100%", width = "100%")
public class PaperRippleDemo extends DemoHelperView {

    public PaperRippleDemo() {
        withHorizontalHeader("PaperRipple",
                "Provides code/syntax highlighting by using prism",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(getExample()).withOrientation(Orientation.PORTRAIT), "Some highlighting examples")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample("<dependency>\n" +
                                "   <groupId>com.github.appreciated</groupId>\n" +
                                "   <artifactId>paper-ripple</artifactId>\n" +
                                "   <version>1.0</version>\n" +
                                "</dependency>", "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add PaperRipple to your View",
                        new CodeExample("return new PaperRippleVerticalLayout(new ExampleContent())", "java", "Java")
                );
    }

    private Component getExample() {
        return new PaperRippleVerticalLayout(new ExampleContent());
    }
}
