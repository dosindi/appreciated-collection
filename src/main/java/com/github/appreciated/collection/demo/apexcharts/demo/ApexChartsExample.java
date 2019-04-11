package com.github.appreciated.collection.demo.apexcharts.demo;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ApexChartsExample extends VerticalLayout {
    public ApexChartsExample() {
        add(new PieChartExample(),
                new DonutChartExample(),
                new LineChartExample(),
                new AreaChartExample(),
                new HorizontalBarChartExample(),
                new VerticalBarChartExample(),
                new RadarChartExample(),
                new RadialBarChartExample(),
                new CandleStickChartExample(),
                new RadarChartExample(),
                new ScatterChartExample());
        getStyle().set("overflow", "auto");
    }
}