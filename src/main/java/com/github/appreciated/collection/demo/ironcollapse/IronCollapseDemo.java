package com.github.appreciated.collection.demo.ironcollapse;


import com.github.appreciated.IronCollapse;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("iron-collapse/")
@BodySize(height = "100%", width = "100%")
public class IronCollapseDemo extends DemoHelperView {

    public IronCollapseDemo() {
        withHorizontalHeader("Iron Collapse",
                "A Component that allows to show and hide Content",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(getExample()).withOrientation(Orientation.PORTRAIT), "Clicking on the Button opens/closes the IronCollapse")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample("<dependency>\n" +
                                "    <groupId>com.github.appreciated</groupId>\n" +
                                "    <artifactId>iron-collapse</artifactId>\n" +
                                "    <version>0.6</version>\n" +
                                "</dependency>", "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add IronCollapse to your View",
                        new CodeExample("VerticalLayout collapseContent = new VerticalLayout(new Label(\"< Your Content >\"));\n" +
                                "collapseContent.getStyle().set(\"border\", \"1px solid var(--lumo-primary-color)\");\n" +
                                "collapseContent.setWidth(\"400px\");\n" +
                                "collapseContent.setHeight(\"400px\");\n" +
                                "IronCollapse collapse = new IronCollapse(collapseContent);", "java", "Java")
                );
    }

    private Component getExample() {
        VerticalLayout collapseContent = new VerticalLayout(new Label("< Your Content >"));
        collapseContent.getStyle().set("border", "1px solid var(--lumo-primary-color)");
        collapseContent.setWidth("400px");
        collapseContent.setHeight("400px");
        collapseContent.setAlignItems(Alignment.CENTER);
        collapseContent.setJustifyContentMode(JustifyContentMode.CENTER);
        IronCollapse collapse = new IronCollapse(collapseContent);
        return new VerticalLayout(new Button("Click me!", event -> collapse.toggle()), collapse);
    }

}
