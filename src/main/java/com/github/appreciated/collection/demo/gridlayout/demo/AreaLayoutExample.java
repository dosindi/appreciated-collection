package com.github.appreciated.collection.demo.gridlayout.demo;

import com.github.appreciated.collection.component.ExampleCard;
import com.github.appreciated.layout.AreaLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class AreaLayoutExample extends VerticalLayout {
    public AreaLayoutExample() {
        AreaLayout layout = new AreaLayout(new String[][]{
                new String[]{"header", "header", "header", "header", "header"},
                new String[]{"left", "content", "content", "content", "right"},
                new String[]{"left", "content", "content", "content", "right"},
                new String[]{"left", "content", "content", "content", "right"},
                new String[]{"left", "content", "content", "content", "right"}
        }).withItemAtArea(new ExampleCard(), "header")
                .withItemAtArea(new ExampleCard(), "left")
                .withItemAtArea(new ExampleCard(), "right")
                .withItemAtArea(new ExampleCard(), "content");
        layout.setSizeFull();
        getStyle().set("overflow", "auto");
        setSizeFull();
        add(layout);
    }
}
