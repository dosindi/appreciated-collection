package com.github.appreciated.collection.component;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.router.Route;

@Tag("embed")
public class Embed extends HtmlContainer {

    private boolean sizeFull;

    public Embed() {
    }

    public Embed(Class<? extends Component> className) {
        setSrc(className.getAnnotation(Route.class).value());
    }

    public Embed(String src) {
        this.setSrc(src);
    }

    public String getSrc() {
        return getElement().getAttribute("src");
    }

    public void setSrc(String src) {
        getElement().setAttribute("src", src);
    }

    public Embed withFullSize() {
        setSizeFull();
        return this;
    }

}

