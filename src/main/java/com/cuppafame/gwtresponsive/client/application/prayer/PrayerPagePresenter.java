/*
 * Copyright (c) 2014. Pitney Bowes Software Inc.
 * All Rights Reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */
package com.cuppafame.gwtresponsive.client.application.prayer;

import javax.inject.Inject;

import com.cuppafame.gwtresponsive.client.application.ApplicationPresenter;
import com.cuppafame.gwtresponsive.client.place.NameTokens;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyStandard;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;



/**
 * Class Description:
 *
 * @author AR001AF : 7/22/15
 * @version: 1.0
 */
public class PrayerPagePresenter extends Presenter<PrayerPagePresenter.MyView, PrayerPagePresenter.MyProxy> {

    public interface MyView extends View {
    }

    @ProxyStandard
    @NameToken(NameTokens.prayer)
    public interface MyProxy extends ProxyPlace<PrayerPagePresenter> {
    }

    @Inject
    PrayerPagePresenter(EventBus eventBus,
            MyView view,
            MyProxy proxy) {
        super(eventBus, view, proxy, ApplicationPresenter.SLOT_SetMainContent);
    }
}
