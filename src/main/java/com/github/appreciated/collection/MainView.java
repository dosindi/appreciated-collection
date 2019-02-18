package com.github.appreciated.collection;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.collection.demo.applayout.AppLayoutDemo;
import com.github.appreciated.collection.demo.calculatedcolorhelper.CalculatedColorHelperDemo;
import com.github.appreciated.collection.demo.card.CardDemo;
import com.github.appreciated.collection.demo.demohelper.DemoHelperDemoView;
import com.github.appreciated.collection.demo.gridlayout.GridLayoutDemo;
import com.github.appreciated.collection.demo.ironcollapse.IronCollapseDemo;
import com.github.appreciated.collection.demo.papercolor.PaperColorDemo;
import com.github.appreciated.collection.demo.papermenubutton.PaperMenuButtonDemo;
import com.github.appreciated.collection.demo.paperripple.PaperRippleDemo;
import com.github.appreciated.collection.demo.prismelement.PrismElementDemo;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.demo.helper.view.components.layout.CssFlexLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route
@PWA(name = "Appreciated Addon Collection", shortName = "Appreciated Collection")
public class MainView extends VerticalLayout {

    public MainView() {
        CssFlexLayout layout = new CssFlexLayout(
                getCard("./frontend/images/applayout/app-layout-logo.png", "App Layout Addon", "A addon that allows you building responsive applications easily", AppLayoutDemo.class),
                getCard("./frontend/images/demohelper/demo-helper-logo.png", "Demo Helper Addon", "A addon that helps you creating beautiful addon demos in no time", DemoHelperDemoView.class),
                getCard("./frontend/images/gridlayout/grid-layout-logo.png", "Css Grid Layout Addon", "A addon that brings css grid to Vaadin Flow", GridLayoutDemo.class),
                getCard("./frontend/images/no-logo.png", "Card Addon", "A addon that brings cards to Vaadin Flow", CardDemo.class),
                getCard("./frontend/images/no-logo.png", "Paper Color Addon", "A color picker addon for Vaadin Flow", PaperColorDemo.class),
                getCard("./frontend/images/no-logo.png", "PaperMenuButton", "A addon that can open a popup on click", PaperMenuButtonDemo.class),
                getCard("./frontend/images/no-logo.png", "PaperRipple", "A addon that can open a popup on click", PaperRippleDemo.class),
                getCard("./frontend/images/no-logo.png", "Prism-Element Addon", "A code/syntax highlighter addon for Vaadin Flow", PrismElementDemo.class),
                getCard("./frontend/images/no-logo.png", "Iron Collapse Addon", "A addon that brings Iron Collapse to Vaadin Flow", IronCollapseDemo.class),
                getCard("./frontend/images/no-logo.png", "Calculated Color Helper Addon", "A addon that brings control over the css variables in Vaadin Flow", CalculatedColorHelperDemo.class)
        );
        layout.setJustifyContentMode(JustifyContentMode.CENTER);
        layout.setFlexWrap(CssFlexLayout.FlexWrap.WRAP);
        add(new DemoHelperView()
                .withVerticalHeader("Appreciated Collection",
                        "Welcome to the Appreciated Collection",
                        "./frontend/images/no-logo.png"
                ).with(layout)
        );
    }

    private Component getCard(String imagePath, String title, String description, Class<? extends Component> route) {
        Image img = new Image(imagePath, title);
        img.setWidth("60px");
        img.setHeight("60px");

        IconItem item = new IconItem(img, title, description);

        RippleClickableCard card = new RippleClickableCard(
                event -> getUI().ifPresent(ui -> ui.navigate(route.getAnnotation(Route.class).value())), item

        );
        item.setWidth("310px");
        item.setHeight("131px");
        card.getStyle().set("margin", "5px");
        return card;
    }

}
