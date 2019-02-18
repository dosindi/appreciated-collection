package com.github.appreciated.collection.demo.paperripple.demo;

import com.github.appreciated.collection.demo.component.ExampleContent;
import com.github.appreciated.ripple.PaperRippleVerticalLayout;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class PaperRippleExample extends VerticalLayout {
    public PaperRippleExample() {
        PaperRippleVerticalLayout layout = new PaperRippleVerticalLayout(new ExampleContent("Click me!"));
        layout.addClickListener(event -> Notification.show("I was clicked"));
        layout.setPadding(false);
        layout.setSizeUndefined();
        add(layout);
    }
}
