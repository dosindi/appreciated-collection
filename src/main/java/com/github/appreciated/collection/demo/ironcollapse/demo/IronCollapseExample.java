package com.github.appreciated.collection.demo.ironcollapse.demo;

import com.github.appreciated.IronCollapse;
import com.github.appreciated.IronCollapseLayout;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class IronCollapseExample extends VerticalLayout {
    public IronCollapseExample() {
        addServerSidedIronCollapse();
        addClientSidedIronCollapse();
    }

    public void addServerSidedIronCollapse() {
        VerticalLayout collapseContent = new VerticalLayout(new Label(" < Your Content >"));
        collapseContent.getStyle().set("border", "1px solid var(--lumo-primary-color)");
        collapseContent.setWidth("400px");
        collapseContent.setHeight("400px");
        IronCollapse collapse = new IronCollapse(collapseContent);
        add(collapse);
        add(new H2("Server-Sided"),
                new Button("Click me!", event -> collapse.toggle()),
                collapse,
                new Label("Some Content below")
        );
    }

    public void addClientSidedIronCollapse() {
        VerticalLayout collapseContent = new VerticalLayout(new Label(" < Your Content >"));
        collapseContent.getStyle().set("border", "1px solid var(--lumo-primary-color)");
        collapseContent.setWidth("400px");
        collapseContent.setHeight("400px");
        add(new H2("Client-Sided"),
                new IronCollapseLayout(new Button("Click me!"), collapseContent),
                new Label("Some Content below")
        );
    }

}
