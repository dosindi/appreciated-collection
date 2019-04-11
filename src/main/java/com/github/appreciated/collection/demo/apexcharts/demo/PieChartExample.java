package com.github.appreciated.collection.demo.apexcharts.demo;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.builder.ChartBuilder;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class PieChartExample extends VerticalLayout {
    public PieChartExample() {
        ApexCharts pieChart = new ApexCharts()
                .withChart(ChartBuilder.get().withType(Type.pie).build())
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(44.0, 55.0, 13.0, 43.0, 22.0);
        pieChart.setHeight("300px");
        add(pieChart);
    }
}
