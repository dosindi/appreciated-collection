package com.github.appreciated.collection.demo.card.demo;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class RippleClickableCardExample extends VerticalLayout {
    public RippleClickableCardExample(String imagePath, String title, String description) {
        Image img = new Image(imagePath, title);
        img.setWidth("50px");
        img.setHeight("50px");
        RippleClickableCard card = new RippleClickableCard(
                componentEvent -> Notification.show("A RippleClickableCard was clicked!"),
                new IconItem(img, title, description)
        );
        card.setWidth("100%");
        add(card);
    }
}
