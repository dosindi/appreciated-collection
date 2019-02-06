package com.github.appreciated.collection.demo.gridlayout.demo;

import com.github.appreciated.collection.component.ExampleCard;
import com.github.appreciated.layout.AreaLayout;

public class AreaLayoutExample extends AreaLayout {
    public AreaLayoutExample() {
        super(new String[][]{
                new String[]{"header", "header", "header", "header", "header"},
                new String[]{"left", "content", "content", "content", "right"},
                new String[]{"left", "content", "content", "content", "right"},
                new String[]{"left", "content", "content", "content", "right"},
                new String[]{"left", "content", "content", "content", "right"}
        });
        withItemAtArea(new ExampleCard(), "header")
                .withItemAtArea(new ExampleCard(), "left")
                .withItemAtArea(new ExampleCard(), "right")
                .withItemAtArea(new ExampleCard(), "content");
        setSizeFull();
        getStyle().set("overflow", "auto");
    }
}
