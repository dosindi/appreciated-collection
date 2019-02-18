package com.github.appreciated.collection.demo.applayout.demo;

import com.github.appreciated.collection.demo.applayout.views.MainAppLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/*RM RM*/", layout = MainAppLayout.class)
public class View1 extends VerticalLayout {

    public View1() {
        // Add the content for this path
    }

}
