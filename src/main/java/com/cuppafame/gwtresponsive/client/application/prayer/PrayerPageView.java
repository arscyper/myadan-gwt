package com.cuppafame.gwtresponsive.client.application.prayer;

import javax.inject.Inject;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class PrayerPageView extends ViewImpl implements PrayerPagePresenter.MyView {
    public interface Binder extends UiBinder<Widget, PrayerPageView> {
    }

    @Inject
    PrayerPageView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }
}
