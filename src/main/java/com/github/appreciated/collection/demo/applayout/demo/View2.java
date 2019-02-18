package com.github.appreciated.collection.demo.applayout.demo;

import com.github.appreciated.collection.demo.applayout.views.MainAppLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "/*RM your route 2 RM*/view2", layout = MainAppLayout.class)
public class View2 extends VerticalLayout {

    public View2() {
        // Add the content for this path
    }

}
