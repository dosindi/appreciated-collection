package com.github.appreciated.collection.demo.ironcollapse.demo;

import com.github.appreciated.IronCollapse;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class IronCollapseExample extends VerticalLayout {
    public IronCollapseExample() {
        VerticalLayout collapseContent = new VerticalLayout(new Label(" < Your Content >"));
        collapseContent.getStyle().set("border", "1px solid var(--lumo-primary-color)");
        collapseContent.setWidth("400px");
        collapseContent.setHeight("400px");
        IronCollapse collapse = new IronCollapse(collapseContent);
        add(collapse);
        add(new Button("Click me!", event -> collapse.toggle()),
                collapse,
                new Label("Some Content below")
        );
    }
}
