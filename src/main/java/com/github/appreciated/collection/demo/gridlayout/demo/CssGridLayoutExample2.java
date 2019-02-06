package com.github.appreciated.collection.demo.gridlayout.demo;

import com.github.appreciated.collection.component.ExampleCard;
import com.github.appreciated.css.grid.sizes.ColOrRow;
import com.github.appreciated.css.grid.sizes.Flex;
import com.github.appreciated.css.grid.sizes.TemplateColOrRow;
import com.github.appreciated.layout.FluentGridLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class CssGridLayoutExample2 extends VerticalLayout {
    public CssGridLayoutExample2() {
        FluentGridLayout layout = new FluentGridLayout();
        Component customColTest = new ExampleCard();
        layout.withTemplateColumns(
                new TemplateColOrRow("col1-start", new Flex(1)),
                new TemplateColOrRow("col2-start", new Flex(1)),
                new TemplateColOrRow("col3-start", new Flex(1)),
                new TemplateColOrRow("col-end"))
                .withTemplateRows(
                        new TemplateColOrRow("row1-start", new Flex(1)),
                        new TemplateColOrRow("row2-start", new Flex(1)),
                        new TemplateColOrRow("row-end"))
                .withItems(customColTest)
                .withColumnStart(customColTest, new ColOrRow("col1-start"))
                .withColumnEnd(customColTest, new ColOrRow("col3-start"))
                .withRowStart(customColTest, new ColOrRow("row1-start"))
                .withRowEnd(customColTest, new ColOrRow("rows-end"));
        layout.setSizeFull();
        getStyle().set("overflow", "auto");
        setSizeFull();
        add(layout);
    }
}
