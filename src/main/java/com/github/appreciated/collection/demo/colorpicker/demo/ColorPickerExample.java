package com.github.appreciated.collection.demo.colorpicker.demo;

import com.github.juchar.colorpicker.ColorPicker;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.awt.*;

public class ColorPickerExample extends VerticalLayout {
    public ColorPickerExample() {
        setPadding(true);
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        setSpacing(true);

        final ColorPicker colorPicker = new ColorPicker(new Color(255, 0, 255, 150), Color.RED);
        colorPicker.setPinnedInputs(true);
        colorPicker.setPinnedPalettes(true);
        colorPicker.setHexEnabled(false);
        colorPicker.setPalette(Color.RED, Color.GREEN, Color.BLUE);
        add(colorPicker);
    }

}
