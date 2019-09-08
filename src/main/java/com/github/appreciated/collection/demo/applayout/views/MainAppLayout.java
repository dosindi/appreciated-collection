package com.github.appreciated.collection.demo.applayout.views;

import com.github.appreciated.app.layout.addons.notification.DefaultNotificationHolder;
import com.github.appreciated.app.layout.addons.notification.component.AppBarNotificationButton;
import com.github.appreciated.app.layout.addons.notification.entity.DefaultNotification;
import com.github.appreciated.app.layout.component.appbar.AppBarBuilder;
import com.github.appreciated.app.layout.component.applayout.Behaviour;
import com.github.appreciated.app.layout.component.builder.AppLayoutBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftAppMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.builder.LeftSubMenuBuilder;
import com.github.appreciated.app.layout.component.menu.left.items.LeftClickableItem;
import com.github.appreciated.app.layout.component.menu.left.items.LeftHeaderItem;
import com.github.appreciated.app.layout.component.menu.left.items.LeftNavigationItem;
import com.github.appreciated.app.layout.component.router.AppLayoutRouterLayout;
import com.github.appreciated.app.layout.entity.DefaultBadgeHolder;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.page.Push;
import com.vaadin.flow.component.page.Viewport;

import static com.github.appreciated.app.layout.entity.Section.FOOTER;
import static com.github.appreciated.app.layout.entity.Section.HEADER;

/**
 * The main view contains a button and a template element.
 */

@Push
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
public class MainAppLayout extends AppLayoutRouterLayout {
    /**
     * Do not initialize here. This will lead to NPEs
     */
    private DefaultNotificationHolder notifications;
    private DefaultBadgeHolder badge;


    public MainAppLayout() {
        notifications = new DefaultNotificationHolder(newStatus -> {
        });
        for (int i = 1; i < 6; i++) {
            notifications.addNotification(new DefaultNotification("Test title" + i, "A rather long test description ..............." + i));
        }

        badge = new DefaultBadgeHolder(5);

        LeftNavigationItem menuEntry = new LeftNavigationItem("Menu", VaadinIcon.MENU.create(), View6.class);
        badge.bind(menuEntry.getBadge());

        init(AppLayoutBuilder
                .get(Behaviour.LEFT_RESPONSIVE_HYBRID)
                .withTitle("App Layout")
                .withAppBar(AppBarBuilder.get()
                        .add(new AppBarNotificationButton(VaadinIcon.BELL, notifications))
                        .build())
                .withAppMenu(LeftAppMenuBuilder.get()
                        .addToSection(new LeftHeaderItem("Menu-Header", "Version 2.0.5", "./frontend/images/applayout/logo.png"), HEADER)
                        .addToSection(new LeftClickableItem("Clickable Entry", VaadinIcon.COG.create(), clickEvent -> Notification.show("onClick ...")), HEADER)
                        .add(new LeftNavigationItem("Home", VaadinIcon.HOME.create(), MainView.class))
                        .add(new LeftNavigationItem("Grid", VaadinIcon.TABLE.create(), GridTest.class))
                        .add(LeftSubMenuBuilder.get("My Submenu", VaadinIcon.PLUS.create())
                                .add(LeftSubMenuBuilder.get("My Submenu", VaadinIcon.PLUS.create())
                                        .add(new LeftNavigationItem("Charts", VaadinIcon.SPLINE_CHART.create(), View2.class))
                                        .add(new LeftNavigationItem("Contact", VaadinIcon.CONNECT.create(), View3.class))
                                        .add(new LeftNavigationItem("More", VaadinIcon.COG.create(), View4.class))
                                        .build())
                                .add(new LeftNavigationItem("Contact1", VaadinIcon.CONNECT.create(), View3.class))
                                .add(new LeftNavigationItem("More1", VaadinIcon.COG.create(), View5.class))
                                .build())
                        .add(menuEntry)
                        .addToSection(new LeftClickableItem("Clickable Entry", VaadinIcon.COG.create(), clickEvent -> Notification.show("onClick ...")), FOOTER)
                        .build())
                .build());
    }

}
