package com.github.appreciated.collection.demo.ironcollapse;


import com.github.appreciated.IronCollapse;
import com.github.appreciated.card.Card;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("iron-collapse/")
@BodySize(height = "100%", width = "100%")
public class IronCollapseDemo extends VerticalLayout {

    public IronCollapseDemo() {
        add(new DemoHelperView()
                .withHorizontalHeader("Iron Collapse",
                        "A Component that allows the user to show and hide Content",
                        "./frontend/images/no-logo.png"
                ).withDevice(
                        new PhoneView(getExample()),
                        "Try it out!")
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
                .withStep("Some code examples", "You can add Iron Collapse to your View the following way",
                        new CodeExample("", "java", "Java")
                )
        );
    }

    private Component getExample() {
        IronCollapse collapse = new IronCollapse(getExampleCards());
        collapse.setWidth("100%");
        return new VerticalLayout(collapse, new Button("Click me!", event -> collapse.toggle()));
    }

    private Component getExampleCards() {
        VerticalLayout vl = new VerticalLayout(
                getCard("./frontend/images/no-logo.png", "A Plain Card", "I contain stuff!"),
                getCard("./frontend/images/no-logo.png", "A Plain Card", "I contain stuff!"),
                getCard("./frontend/images/no-logo.png", "A Plain Card", "I contain stuff!")
        );
        vl.setMargin(false);
        vl.setPadding(true);
        vl.setSizeFull();
        return vl;
    }

    private Component getCard(String imagePath, String title, String description) {
        Image img = new Image(imagePath, title);
        img.setWidth("50px");
        img.setHeight("50px");
        Card card = new Card(
                new IconItem(img, title, description)
        );
        card.setWidth("100%");
        return card;
    }

}
