/*
 * Copyright (c) 2014. Pitney Bowes Software Inc.
 * All Rights Reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */
package com.cuppafame.gwtresponsive.client.application.prayer;

/**
 * Class Description:
 *
 * @author AR001AF : 7/23/15
 * @version: 1.0
 */
import java.util.ArrayList;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
    void refreshWatchList(ArrayList<String> stocks, AsyncCallback<StockPrice[]> callback);
}
