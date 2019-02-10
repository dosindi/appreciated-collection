package com.github.appreciated.collection.component;

import com.github.appreciated.card.ClickableCard;
import com.vaadin.flow.component.html.Div;

public class ExampleCard extends ClickableCard {
    public ExampleCard() {
        Div div = new Div();
        div.getStyle().set("background", MaterialColors.getRandomColor());
        div.setSizeFull();
        add(div);
        setSizeFull();
    }
}