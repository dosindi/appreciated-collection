package com.github.appreciated.collection.demo.apexcharts.demo;

import com.github.appreciated.apexcharts.ApexCharts;
import com.github.appreciated.apexcharts.config.Chart;
import com.github.appreciated.apexcharts.config.builder.*;
import com.github.appreciated.apexcharts.config.chart.Type;
import com.github.appreciated.apexcharts.config.chart.zoom.builder.ZoomBuilder;
import com.github.appreciated.apexcharts.config.grid.builder.RowBuilder;
import com.github.appreciated.apexcharts.config.stroke.Curve;
import com.github.appreciated.apexcharts.config.subtitle.Align;
import com.github.appreciated.apexcharts.helper.MapSeries;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class ApexChartsExample extends VerticalLayout {
    public ApexChartsExample() {
        add(getPieChart());
        add(getLineChart());
    }

    private Component getPieChart() {
        Chart chart = new Chart();
        chart.setType(Type.pie);

        ApexCharts pieChart = new ApexCharts()
                .withChart(chart)
                .withLabels("Team A", "Team B", "Team C", "Team D", "Team E")
                .withSeries(44.0, 55.0, 13.0, 43.0, 22.0);
        return pieChart;
    }

    private Component getLineChart() {
        ApexCharts lineChart = new ApexCharts()
                .withChart(ChartBuilder.get()
                        .withType(Type.line)
                        .withZoom(ZoomBuilder.get()
                                .withEnabled(false)
                                .build())
                        .build())
                .withStroke(StrokeBuilder.get()
                        .withCurve(Curve.straight)
                        .build())
                .withTitle(TitleSubtitleBuilder.get()
                        .withText("Product Trends by Month")
                        .withAlign(Align.left)
                        .build())
                .withGrid(GridBuilder.get()
                        .withRow(RowBuilder.get()
                                .withColors("#f3f3f3", "transparent")
                                .withOpacity(0.5).build()
                        ).build())
                .withXaxis(XAxisBuilder.get()
                        .withCategories("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep")
                        .build())
                .withSeries(new MapSeries("Desktops", 10.0, 41.0, 35.0, 51.0, 49.0, 62.0, 69.0, 91.0, 148.0));
        lineChart.setWidth("550px");
        lineChart.setHeight("350px");
        return lineChart;
    }
}
