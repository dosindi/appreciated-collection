package com.github.appreciated.collection.demo.applayout.views;

import com.vaadin.flow.router.Route;

@Route(value = "app-layout-demo/view3", layout = MainAppLayout.class)
public class View3 extends AbstractView {
    @Override
    String getViewName() {
        return getClass().getName();
    }
}