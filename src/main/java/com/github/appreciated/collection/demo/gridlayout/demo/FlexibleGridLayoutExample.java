package com.github.appreciated.collection.demo.gridlayout.demo;

import com.github.appreciated.collection.component.ExampleCard;
import com.github.appreciated.css.grid.sizes.Flex;
import com.github.appreciated.css.grid.sizes.Length;
import com.github.appreciated.css.grid.sizes.MinMax;
import com.github.appreciated.css.grid.sizes.Repeat;
import com.github.appreciated.layout.FlexibleGridLayout;

public class FlexibleGridLayoutExample extends FlexibleGridLayout {
    public FlexibleGridLayoutExample() {
        withColumns(Repeat.RepeatMode.AUTO_FILL, new MinMax(new Length("220px"), new Flex(1)))
                .withAutoRows(new Length("220px"))
                .withGap(new Length("10px"))
                .withItems(
                        new ExampleCard())
                .withItemWithSize(new ExampleCard(), 2, 2)
                .withItems(
                        new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard(), new ExampleCard()
                );
        setSizeFull();
        getStyle().set("overflow", "auto");
    }
}
