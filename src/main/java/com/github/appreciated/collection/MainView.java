package com.github.appreciated.collection;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.collection.demo.card.CardDemo;
import com.github.appreciated.collection.demo.demohelper.DemoHelperDemoView;
import com.github.appreciated.collection.demo.ironcollapse.IronCollapseDemo;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route
@PWA(name = "Appreciated Addon Collection", shortName = "Appreciated Collection")
public class MainView extends VerticalLayout {

    public MainView() {
        add(new DemoHelperView().withVerticalHeader("Appreciated Collection",
                "Welcome to the Appreciated Collection",
                "./frontend/images/no-logo.png"
                ).withComponent(new HorizontalLayout(
                        getCard("./frontend/images/no-logo.png", "Demo Helper Addon", "A addon that helps you creating beautiful addon demos in no time", DemoHelperDemoView.class),
                        getCard("./frontend/images/no-logo.png", "Card Addon", "A addon that brings cards to Vaadin Flow", CardDemo.class),
                        getCard("./frontend/images/no-logo.png", "Iron Collapse Addon", "A addon that brings Iron Collapse to Vaadin Flow", IronCollapseDemo.class))
                )
        );
    }

    private Component getCard(String imagePath, String title, String description, Class<? extends Component> route) {
        Image img = new Image(imagePath, title);
        img.setWidth("60px");
        img.setHeight("60px");

        IconItem item = new IconItem(img, title, description);

        RippleClickableCard card = new RippleClickableCard(
                event -> getUI().ifPresent(ui -> ui.navigate(route.getAnnotation(Route.class).value())), item

        );
        item.setWidth("310px");
        item.setHeight("131px");
        return card;
    }

}
