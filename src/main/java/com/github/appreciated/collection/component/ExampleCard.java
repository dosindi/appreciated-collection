package com.github.appreciated.collection.component;

import com.github.appreciated.card.ClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;

public class ExampleCard extends ClickableCard {
    public ExampleCard() {
        Image img = new Image("./frontend/images/no-logo.png", "logo");
        img.setWidth("50px");
        img.setHeight("50px");
        add(new IconItem(img, "A Clickable Card", " with Hover effect"));
        addClickListener(event -> Notification.show("You clicked me"));
        add(new Div());
        setSizeFull();
    }
}