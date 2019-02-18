package com.github.appreciated.collection.demo.papermenubutton.demo;

import com.github.appreciated.papermenubutton.PaperMenuButton;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class PaperMenuButtonExample extends VerticalLayout {
    public PaperMenuButtonExample() {
        VerticalLayout popupContent = new VerticalLayout(new Label("< PaperMenuButtonExample >"));
        popupContent.getStyle().set("border", "1px solid var(--lumo-primary-color)");
        popupContent.setWidth("400px");
        popupContent.setHeight("400px");
        popupContent.setAlignItems(FlexComponent.Alignment.CENTER);
        popupContent.setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        add(new PaperMenuButton(new Button("Test"), popupContent),
                new Label("Some Content below")
        );
    }
}
