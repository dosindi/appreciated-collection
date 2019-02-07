package com.github.appreciated.collection.demo.gridlayout.demo;

import com.github.appreciated.collection.component.ExampleCard;
import com.github.appreciated.css.grid.GridLayoutComponent;
import com.github.appreciated.css.grid.sizes.Flex;
import com.github.appreciated.css.grid.sizes.Length;
import com.github.appreciated.css.grid.sizes.MinMax;
import com.github.appreciated.css.grid.sizes.Repeat;
import com.github.appreciated.layout.FlexibleGridLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;

public class FlexibleGridLayoutExample extends HorizontalLayout {
    public FlexibleGridLayoutExample() {
        FlexibleGridLayout layout = new FlexibleGridLayout()
                .withColumns(Repeat.RepeatMode.AUTO_FILL, new MinMax(new Length("220px"), new Flex(1)))
                .withAutoRows(new Length("220px"))
                .withItems(
                        new ExampleCard(), new ExampleCard())
                .withItemWithSize(new ExampleCard(), 2, 2)
                .withItems(
                        new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard()
                )
                .withPadding(true)
                .withSpacing(true)
                .withOverflow(GridLayoutComponent.Overflow.AUTO);
        layout.setSizeFull();
        setSizeFull();
        add(layout);
    }
}
