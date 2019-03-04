package com.github.appreciated.collection.demo.masterdetail.demo;

import com.github.appreciated.collection.demo.masterdetail.demo.component.ChatOverview;
import com.github.appreciated.masterdetail.MasterDetailView;
import com.vaadin.flow.router.BeforeEvent;
import com.vaadin.flow.router.Route;

@Route("masterdetail/master")
public class MasterDemoView extends MasterDetailView<ChatOverview, DetailDemoView, Integer> {

    public MasterDemoView() {
        setMaster(new ChatOverview());
        setDetail(DetailDemoView.class);
    }

    @Override
    public void setParameter(BeforeEvent beforeEvent, Integer integer) {
        setParameter(integer);
    }
}
