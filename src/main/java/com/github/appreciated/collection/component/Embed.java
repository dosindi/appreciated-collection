package com.github.appreciated.collection.component;

import com.vaadin.flow.component.*;
import com.vaadin.flow.router.Route;

@Tag("embed")
public class Embed extends HtmlContainer {
    private static final PropertyDescriptor<String, String> srcDescriptor = PropertyDescriptors.attributeWithDefault("src", "", false);

    public Embed() {
    }

    public Embed(Class<? extends Component> className) {
        setSrc(className.getAnnotation(Route.class).value());
    }

    public Embed(String src) {
        this.setSrc(src);
    }

    public void removeSrc() {
        this.getElement().removeAttribute("src");
    }

    public String getSrc() {
        return this.get(srcDescriptor);
    }

    public void setSrc(String href) {
        this.set(srcDescriptor, href);
    }

}

