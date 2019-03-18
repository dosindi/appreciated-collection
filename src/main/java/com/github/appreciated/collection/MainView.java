package com.github.appreciated.collection;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.collection.demo.applayout.AppLayoutDemo;
import com.github.appreciated.collection.demo.calculatedcolorhelper.CalculatedColorHelperDemo;
import com.github.appreciated.collection.demo.card.CardDemo;
import com.github.appreciated.collection.demo.demohelper.DemoHelperDemoView;
import com.github.appreciated.collection.demo.gridlayout.GridLayoutDemo;
import com.github.appreciated.collection.demo.ironcollapse.IronCollapseDemo;
import com.github.appreciated.collection.demo.masterdetail.MasterDetailDemo;
import com.github.appreciated.collection.demo.papercolor.PaperColorDemo;
import com.github.appreciated.collection.demo.papermenubutton.PaperMenuButtonDemo;
import com.github.appreciated.collection.demo.paperripple.PaperRippleDemo;
import com.github.appreciated.collection.demo.prismelement.PrismElementDemo;
import com.github.appreciated.collection.demo.progressbarjs.ProgressbarJSDemo;
import com.github.appreciated.css.grid.GridLayoutComponent;
import com.github.appreciated.css.grid.sizes.Flex;
import com.github.appreciated.css.grid.sizes.Length;
import com.github.appreciated.css.grid.sizes.MinMax;
import com.github.appreciated.css.grid.sizes.Repeat;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.layout.FlexibleGridLayout;
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
        FlexibleGridLayout layout = new FlexibleGridLayout()
                .withColumns(Repeat.RepeatMode.AUTO_FILL, new MinMax(new Length("320px"), new Flex(1)))
                .withAutoRows(new Length("131px"))
                .withItems(
                        getCard("./frontend/images/applayout/logo.png", "App Layout Addon", "A addon that allows you building responsive applications easily", AppLayoutDemo.class),
                        getCard("./frontend/images/demohelper/logo.png", "Demo Helper Addon", "A addon that helps you creating beautiful addon demos in no time", DemoHelperDemoView.class),
                        getCard("./frontend/images/gridlayout/logo.png", "Css Grid Layout Addon", "A addon that brings css grid to Vaadin Flow", GridLayoutDemo.class),
                        getCard("./frontend/images/card/logo.png", "Card Addon", "A addon that brings cards to Vaadin Flow", CardDemo.class),
                        getCard("./frontend/images/progressbarjs/logo.png", "Progressbar.js Addon", "A addon that brings Progressbar.js to Vaadin Flow", ProgressbarJSDemo.class),
                        getCard("./frontend/images/masterdetail/logo.png", "Master/Detail View Addon", "A addon that brings the Master/Detail Pattern to Vaadin Flow", MasterDetailDemo.class),
                        getCard("./frontend/images/color/logo.png", "Paper Color Addon", "A color picker addon for Vaadin Flow", PaperColorDemo.class),
                        getCard("./frontend/images/menubutton/logo.png", "PaperMenuButton", "A addon that can open a popup on click", PaperMenuButtonDemo.class),
                        getCard("./frontend/images/ripple/logo.png", "PaperRipple", "Gives feedback if an area was clicked", PaperRippleDemo.class),
                        getCard("./frontend/images/prism/logo.png", "Prism-Element Addon", "A code/syntax highlighter addon for Vaadin Flow", PrismElementDemo.class),
                        getCard("./frontend/images/ironcollapse/logo.png", "Iron Collapse Addon", "A addon that brings Iron Collapse to Vaadin Flow", IronCollapseDemo.class),
                        getCard("./frontend/images/colorhelper/logo.png", "Calculated Color Helper Addon", "A addon that brings control over the css variables in Vaadin Flow", CalculatedColorHelperDemo.class)
                )
                .withPadding(true)
                .withSpacing(true)
                .withAutoFlow(GridLayoutComponent.AutoFlow.ROW_DENSE)
                .withOverflow(GridLayoutComponent.Overflow.AUTO);
        layout.setWidth("100%");
        add(new DemoHelperView()
                .withVerticalHeader("Appreciated Collection",
                        "Welcome to the Appreciated Collection",
                        "./frontend/images/collection/logo.png"
                ).with(layout)
        );
    }

    private Component getCard(String imagePath, String title, String description, Class<? extends Component> route) {
        Image img = new Image(imagePath, title);
        img.setWidth("60px");
        img.setHeight("60px");

        IconItem item = new IconItem(img, title, description);
        item.setSizeFull();

        RippleClickableCard card = new RippleClickableCard(
                event -> getUI().ifPresent(ui -> ui.navigate(route.getAnnotation(Route.class).value())), item
        );
        card.getStyle().set("margin", "5px");
        return card;
    }

}
