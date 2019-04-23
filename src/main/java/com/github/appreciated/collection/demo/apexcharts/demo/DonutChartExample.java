package com.github.appreciated.collection.demo.apexcharts.demo;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class DonutChartExample extends VerticalLayout {
    public DonutChartExample() {
        ApexCharts donutChart = new ApexCharts()
                .withChart(ChartBuilder.get().withType(Type.donut).build())
                .withSeries(44.0, 55.0, 41.0, 17.0, 15.0);
        add(donutChart);
    }
}
