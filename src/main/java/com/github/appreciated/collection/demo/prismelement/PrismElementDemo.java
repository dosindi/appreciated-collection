package com.github.appreciated.collection.demo.prismelement;


import com.github.appreciated.collection.demo.prismelement.demo.PrismHighlighterExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entitiy.CodeExample;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("prism-element/")
@BodySize(height = "100%", width = "100%")
public class PrismElementDemo extends DemoHelperView {

    public PrismElementDemo() {
        withHorizontalHeader("Prism Element",
                "Provides code/syntax highlighting by using prism",
                "./frontend/images/prism/logo.png")
                .withDevice(new TabletView(new PrismHighlighterExample()).withOrientation(Orientation.PORTRAIT), "Some highlighting examples")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample(new AppreciatedDependencyReader("prism-element")))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", Language.markup, "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add PrismHighlighter to your View",
                        new CodeExample(PrismHighlighterExample.class)
                );
    }
}
