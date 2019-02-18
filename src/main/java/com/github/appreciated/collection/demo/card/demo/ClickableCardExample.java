package com.github.appreciated.collection.demo.card.demo;

import com.github.appreciated.card.ClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ClickableCardExample extends VerticalLayout {
    public ClickableCardExample(String imagePath, String title, String description) {
        Image img = new Image(imagePath, title);
        img.setWidth("50px");
        img.setHeight("50px");
        ClickableCard card = new ClickableCard(
                componentEvent -> Notification.show("A ClickableCard was clicked!"),
                new IconItem(img, title, description)
        );
        card.setWidth("100%");
        add(card);
    }
}
