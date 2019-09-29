package com.github.appreciated.collection.demo.swiper.demo;

import com.github.appreciated.Swiper;
import com.github.appreciated.SwiperConfigBuilder;
import com.github.appreciated.card.RippleClickableCard;
import com.github.appreciated.config.Direction;
import com.github.appreciated.config.builder.PaginationBuilder;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class SwiperExample extends VerticalLayout {

    public SwiperExample() {
        setSizeFull();
        addHeader("Horizontal Swiper");
        addHorizontal();
        addHeader("Horizontal Swiper w. Pagination");
        addHorizontalWithPagination();
        addHeader("Horizontal Swiper w. auto Slides");
        addHorizontalMulti();
        addHeader("Horizontal Swiper w. auto Slides");
        addHorizontalMultiCentered();
        addHeader("Vertical Swiper");
        addVertical();
        setPadding(false);
        setMargin(false);
        getChildren().forEach(component -> component.getElement().getStyle().set("flex-shrink", "0"));
        getStyle().set("overflow", "auto");
    }

    private void addHeader(String header) {
        add(new H2(header));
    }

    private void addHorizontal() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withAlignment(Alignment.CENTER)
                .withJustifyContentMode(JustifyContentMode.CENTER)
                .withAllowSlidePrev(true)
                .withAllowSlideNext(true)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addHorizontalWithPagination() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withAlignment(Alignment.CENTER)
                .withJustifyContentMode(JustifyContentMode.CENTER)
                .withPagination(PaginationBuilder.get().withEl(".swiper-pagination").build())
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addHorizontalMulti() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withAlignment(Alignment.CENTER)
                .withJustifyContentMode(JustifyContentMode.CENTER)
                .withSlidesPerView("auto")
                .withSpaceBetween(30.0)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addHorizontalMultiCentered() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.HORIZONTAL)
                .withAlignment(Alignment.CENTER)
                .withJustifyContentMode(JustifyContentMode.CENTER)
                .withSlidesPerView("auto")
                .withCenteredSlides(true)
                .withSpaceBetween(30.0)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    private void addVertical() {
        Swiper sw = new Swiper(SwiperConfigBuilder.get()
                .withDirection(Direction.VERTICAL)
                .withAlignment(Alignment.CENTER)
                .withJustifyContentMode(JustifyContentMode.CENTER)
                .build()
        );
        sw.setHeight("300px");
        sw.setWidth("100%");
        sw.add(getSlide(), getSlide(), getSlide(), getSlide());
        add(sw);
    }

    RippleClickableCard getSlide() {
        RippleClickableCard slide = new RippleClickableCard();
        slide.setElevationOnActionEnabled(true);
        slide.getTemplateDiv().setWidth("300px");
        slide.getTemplateDiv().setHeight("150px");
        slide.add(new Label("Foobar"));
        slide.getContent().setAlignItems(FlexComponent.Alignment.CENTER);
        slide.getContent().setJustifyContentMode(FlexComponent.JustifyContentMode.CENTER);
        return slide;
    }

}
