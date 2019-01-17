package com.github.appreciated.collection.demo.applayout.views;

import com.vaadin.flow.router.Route;

@Route(value = "app-layout/demo/view7", layout = MainAppLayout.class)
public class View7 extends AbstractView {
    @Override
    String getViewName() {
        return getClass().getName();
    }
}