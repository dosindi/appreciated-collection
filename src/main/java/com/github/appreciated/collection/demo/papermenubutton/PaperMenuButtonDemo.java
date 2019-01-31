package com.github.appreciated.collection.demo.papermenubutton;


import com.github.appreciated.collection.demo.component.ExampleContent;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.Orientation;
import com.github.appreciated.demo.helper.view.devices.TabletView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.github.appreciated.papermenubutton.PaperMenuButton;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("paper-menu-button/")
@BodySize(height = "100%", width = "100%")
public class PaperMenuButtonDemo extends DemoHelperView {

    public PaperMenuButtonDemo() {
        withHorizontalHeader("PaperMenuButton",
                "Allows to open a popup on the click of a trigger Component. Similar to the PopupView",
                "./frontend/images/no-logo.png")
                .withDevice(new TabletView(getExample()).withOrientation(Orientation.PORTRAIT), "Some  examples")
                .withStep("Add dependency", "Add the dependency by adding it to your POM",
                        new CodeExample("<dependency>\n" +
                                "    <groupId>com.github.appreciated</groupId>\n" +
                                "    <artifactId>vaadin-paper-menu-button</artifactId>\n" +
                                "    <version>1.0.0</version>\n" +
                                "</dependency>", "xml", "Maven"))
                .withStep("Install dependency", "Install the dependency by running the following Maven goal",
                        new CodeExample("install", "xml", "Maven")
                )
                .resetCounterStep()
                .withStep("Some code examples", "Add a PaperMenuButton to your View",
                        new CodeExample("PaperMenuButton paperMenuButton = new PaperMenuButton(new Button(\"Test\"), < Your Content Component >));", "java", "Java")
                );
    }

    private Component getExample() {
        PaperMenuButton paperMenuButton = new PaperMenuButton(new Button("Test"), new ExampleContent());
        return new VerticalLayout(paperMenuButton);
    }

}
