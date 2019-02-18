package com.github.appreciated.collection.demo.papercolor.demo;

import com.github.appreciated.papercolor.PaperColorPicker;
import com.github.appreciated.papercolor.PaperColorPickerAdvanced;
import com.github.appreciated.papercolor.textfield.PaperColorAdvancedTextField;
import com.github.appreciated.papercolor.textfield.PaperColorTextField;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class PaperColorExample extends VerticalLayout {
    public PaperColorExample() {
        PaperColorTextField field = new PaperColorTextField();
        PaperColorAdvancedTextField advancedTextField = new PaperColorAdvancedTextField();
        PaperColorPicker picker = new PaperColorPicker();
        PaperColorPickerAdvanced pickerAdvanced = new PaperColorPickerAdvanced();
        add(field, advancedTextField, picker, pickerAdvanced);
    }
}
