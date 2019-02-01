package com.github.appreciated.collection.demo.card;


import com.github.appreciated.card.Card;
import com.github.appreciated.card.ClickableCard;
import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.collection.maven.DependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.demo.helper.view.entity.CodeExample;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.router.Route;

@Route("card/")
@BodySize(height = "100%", width = "100%")
public class CardDemo extends DemoHelperView {

    public CardDemo() {
        withHorizontalHeader("Card",
                "\"Cards are surfaces that display content and actions on a single topic.\n" +
                        "\n" +
                        "They should be easy to scan for relevant and actionable information. Elements, like text and images, should be placed on them in a way that clearly indicates hierarchy.\"\n" +
                        "- material.io",
                "./frontend/images/no-logo.png"
        ).withDevice(
                new PhoneView(getExampleCards()),
                "Bring Material Cards to your application")
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample(new DependencyReader("card").getDependencyString(), "xml", "Maven"))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", "xml", "Maven"))
                .resetCounterStep()
                .withStep("Some code examples", "You can add cards to your View the following way",
                        new CodeExample("Card card = new Card(\n" +
                                "        new IconItem(img, title, description)\n" +
                                ");", "java", "Java"),
                        new CodeExample("ClickableCard card = new ClickableCard(\n" +
                                "        new IconItem(img, title, description)\n" +
                                ");", "java", "Java"),
                        new CodeExample("RippleClickableCard card = new RippleClickableCard(\n" +
                                "        new IconItem(img, title, description)\n" +
                                ");", "java", "Java")
                );
    }

    private Component getExampleCards() {
        VerticalLayout vl = new VerticalLayout(
                getCard("./frontend/images/no-logo.png", "A Plain Card", "I contain stuff!"),
                getClickableCard("./frontend/images/no-logo.png", "A Clickable Card", " with Hover effect"),
                getRippleClickableCard("./frontend/images/no-logo.png", "A Clickable Card", " with \"Ripple\" effect and \"hover\" effect")
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

    private Component getClickableCard(String imagePath, String title, String description) {
        Image img = new Image(imagePath, title);
        img.setWidth("50px");
        img.setHeight("50px");
        ClickableCard card = new ClickableCard(componentEvent -> Notification.show("A ClickableCard was clicked!"),
                new IconItem(img, title, description)
        );
        card.setWidth("100%");
        return card;
    }

    private Component getRippleClickableCard(String imagePath, String title, String description) {
        Image img = new Image(imagePath, title);
        img.setWidth("50px");
        img.setHeight("50px");
        RippleClickableCard card = new RippleClickableCard(componentEvent -> Notification.show("A RippleClickableCard was clicked!"),
                new IconItem(img, title, description)
        );
        card.setWidth("100%");
        return card;
    }

}
