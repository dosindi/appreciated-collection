package com.github.appreciated.collection;

import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.card.content.IconItem;
import com.github.appreciated.collection.demo.apexcharts.ApexChartsDemo;
import com.github.appreciated.collection.demo.applayout.AppLayoutDemo;
import com.github.appreciated.collection.demo.calculatedcolorhelper.CalculatedColorHelperDemo;
import com.github.appreciated.collection.demo.card.CardDemo;
import com.github.appreciated.collection.demo.demohelper.DemoHelperViewDemo;
import com.github.appreciated.collection.demo.gridlayout.GridLayoutDemo;
import com.github.appreciated.collection.demo.ironcollapse.IronCollapseDemo;
import com.github.appreciated.collection.demo.masterdetail.MasterDetailDemo;
import com.github.appreciated.collection.demo.papermenubutton.PaperMenuButtonDemo;
import com.github.appreciated.collection.demo.paperripple.PaperRippleDemo;
import com.github.appreciated.collection.demo.prismelement.PrismElementDemo;
import com.github.appreciated.collection.demo.swiper.SwiperDemo;
import com.github.appreciated.css.grid.GridLayoutComponent;
import com.github.appreciated.css.grid.sizes.Flex;
import com.github.appreciated.css.grid.sizes.Length;
import com.github.appreciated.css.grid.sizes.MinMax;
import com.github.appreciated.css.grid.sizes.Repeat;
import com.github.appreciated.demo.helper.DemoHelperView;
import com.github.appreciated.layout.FlexibleGridLayout;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.page.BodySize;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

/**
 * The main view contains a button and a click listener.
 */
@Route
@Push
@PWA(name = "Appreciated Addon Collection", shortName = "Appreciated Collection")
@BodySize(height = "100%", width = "100%")
public class MainView extends DemoHelperView {

    public MainView() {
        FlexibleGridLayout layout = new FlexibleGridLayout()
                .withColumns(Repeat.RepeatMode.AUTO_FILL, new MinMax(new Length("320px"), new Flex(1)))
                .withAutoRows(new Length("131px"))
                .withItems(
                        getCard("./frontend/images/applayout/logo.png", "App Layout Addon", "A maddon that allows you building responsive applications easily", AppLayoutDemo.class),
                        getCard("./frontend/images/no-logo.png", "ApexCharts.js Addon", "An ApexCharts.js wrapper to build interactive charts and visualizations", ApexChartsDemo.class),
                        getCard("./frontend/images/no-logo.png", "Swiper Addon", "A component to build horizontally and vertically scrollable containers with stops", SwiperDemo.class),
                        getCard("./frontend/images/demohelper/logo.png", "Demo Helper Addon", "An addon that helps you creating beautiful addon demos in no time", DemoHelperViewDemo.class),
                        getCard("./frontend/images/gridlayout/logo.png", "Css Grid Layout Addon", "An addon that brings css grid to Vaadin Flow", GridLayoutDemo.class),
                        getCard("./frontend/images/card/logo.png", "Card Addon", "An addon that brings cards to Vaadin Flow", CardDemo.class),
                        getCard("./frontend/images/masterdetail/logo.png", "Master/Detail View Addon", "An addon that brings the Master/Detail Pattern to Vaadin Flow", MasterDetailDemo.class),
                        getCard("./frontend/images/menubutton/logo.png", "PaperMenuButton", "An addon that can open a popup on click", PaperMenuButtonDemo.class),
                        getCard("./frontend/images/ripple/logo.png", "PaperRipple", "Gives feedback if an area was clicked", PaperRippleDemo.class),
                        getCard("./frontend/images/prism/logo.png", "Prism-Element Addon", "A code/syntax highlighter addon for Vaadin Flow", PrismElementDemo.class),
                        getCard("./frontend/images/ironcollapse/logo.png", "Iron Collapse Addon", "An addon that brings Iron Collapse to Vaadin Flow", IronCollapseDemo.class),
                        getCard("./frontend/images/colorhelper/logo.png", "Calculated Color Helper Addon", "An addon that brings control over the css variables in Vaadin Flow", CalculatedColorHelperDemo.class)
                )
                .withPadding(true)
                .withSpacing(true)
                .withAutoFlow(GridLayoutComponent.AutoFlow.ROW_DENSE)
                .withOverflow(GridLayoutComponent.Overflow.AUTO);
        layout.setWidth("100%");

        withVerticalHeader("Appreciated Collection",
                "Welcome to the Appreciated Collection",
                "./frontend/images/collection/logo.png")
                .with(layout);
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
