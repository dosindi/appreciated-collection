package com.github.appreciated.collection.demo.demohelper.demo;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.Route;

@Push
@Route("demo-helper/test")
public class OtherContent extends VerticalLayout {
    public OtherContent() {
        Label label = new Label("I am embedded Browser that presents a Route #1 and behave similar to a browser Window");
        label.setSizeFull();
        add(label);
        RadioButtonGroup<String> group = new RadioButtonGroup<String>();
        group.setItems("Test");
        add(new Button("Navigate to other view", event -> UI.getCurrent().navigate(OtherContent2.class)), group);
        setSizeFull();
    }
}