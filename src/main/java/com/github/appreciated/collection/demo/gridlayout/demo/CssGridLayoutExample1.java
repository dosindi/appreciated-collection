package com.github.appreciated.collection.demo.gridlayout.demo;

import com.github.appreciated.collection.component.ExampleCard;
import com.github.appreciated.css.grid.GridLayoutComponent;
import com.github.appreciated.css.grid.sizes.Flex;
import com.github.appreciated.layout.FluentGridLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CssGridLayoutExample1 extends VerticalLayout {
    public CssGridLayoutExample1() {
        Component alignTestComponent = new ExampleCard();
        FluentGridLayout layout = new FluentGridLayout()
                .withTemplateRows(new Flex(1), new Flex(1), new Flex(1))
                .withTemplateColumns(new Flex(1), new Flex(1), new Flex(1))
                .withColumnAlign(alignTestComponent, GridLayoutComponent.ColumnAlign.END)
                .withRowAlign(alignTestComponent, GridLayoutComponent.RowAlign.END)
                .withRowAndColumn(alignTestComponent, 1, 1, 1, 3)
                .withRowAndColumn(new ExampleCard(), 2, 1)
                .withRowAndColumn(new ExampleCard(), 2, 2)
                .withRowAndColumn(new ExampleCard(), 1, 3, 3, 3);
        layout.setSizeFull();
        getStyle().set("overflow", "auto");
        setSizeFull();
        add(layout);
    }
}
