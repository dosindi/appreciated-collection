package com.github.appreciated.collection;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.collection.demo.card.CardDemo;
import com.github.appreciated.collection.demo.demohelper.DemoHelperDemoView;
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
                "./frontend/images/no-icon.png"
                ).withComponent(new HorizontalLayout(
                        getCard("./frontend/images/no-icon.png", "Demo Helper Addon", "A addon to help you creating beautiful demos in no time", DemoHelperDemoView.class),
                        getCard("./frontend/images/no-icon.png", "Card Addon", "A addon that brings cards to Lumo", CardDemo.class),
                        getCard("./frontend/images/icon.png", "Demo Helper Addon", "A addon to help you creating beautiful demos in no time", DemoHelperDemoView.class))
                )
        );
    }

    private Component getCard(String imagePath, String title, String description, Class<? extends Component> route) {
        Image img = new Image(imagePath, title);
        img.setWidth("50px");
        img.setHeight("50px");
        RippleClickableCard card = new RippleClickableCard(
                event -> getUI().ifPresent(ui -> ui.navigate(route.getAnnotation(Route.class).value())),
                new IconItem(img, title, description)
        );
        card.setWidth("300px");
        card.setHeight("50px");
        return card;
    }

}
