package com.github.appreciated.collection.demo.apexcharts.demo;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class MultiRadialBarChartExample extends VerticalLayout {
    public MultiRadialBarChartExample() {
        ApexCharts multiRadialBarChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.radialBar)
                        .build())
                .withSeries(44.0, 55.0, 67.0, 83.0)
                .withLabels("Apples", "Oranges", "Bananas", "Berries");
        add(multiRadialBarChart);
    }
}
