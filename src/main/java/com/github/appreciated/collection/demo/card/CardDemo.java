package com.github.appreciated.collection.demo.card;


import com.github.appreciated.collection.demo.card.demo.CardExample;
import com.github.appreciated.collection.demo.card.demo.ClickableCardExample;
import com.github.appreciated.collection.demo.card.demo.RippleClickableCardExample;
import com.github.appreciated.collection.maven.AppreciatedDependencyReader;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.entitiy.CodeExample;
import com.github.appreciated.demo.helper.view.devices.PhoneView;
import com.github.appreciated.prism.element.Language;
import com.vaadin.flow.component.Component;
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
                "./frontend/images/card/logo.png"
        ).withDevice(
                new PhoneView(getExampleCards()),
                "Bring Material Cards to your application")
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample(new AppreciatedDependencyReader("card")))
                .withStep("Add dependency", "Add the dependency to your POM",
                        new CodeExample("install", Language.markup, "Maven"))
                .resetCounterStep()
                .withStep("Some code examples", "You can add cards to your View the following way",
                        new CodeExample(CardExample.class),
                        new CodeExample(ClickableCardExample.class),
                        new CodeExample(RippleClickableCardExample.class)
                );
    }

    private Component getExampleCards() {
        VerticalLayout vl = new VerticalLayout(
                new CardExample("./frontend/images/logo.png", "A Plain Card", "I contain stuff!"),
                new ClickableCardExample("./frontend/images/logo.png", "A Clickable Card", " with Hover effect"),
                new RippleClickableCardExample("./frontend/images/logo.png", "A Clickable Card", " with \"Ripple\" effect and \"hover\" effect")
        );
        vl.setMargin(false);
        vl.setPadding(true);
        vl.setSizeFull();
        return vl;
    }


}
