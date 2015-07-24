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
 **/

import com.google.gwt.core.client.JavaScriptObject;

class PrayerData extends JavaScriptObject {                              // <span style="color:black;">**(1)**</span>
    // Overlay types always have protected, zero argument constructors.
    protected PrayerData() {}                                              // <span style="color:black;">**(2)**</span>

    // JSNI methods to get stock data.
    public final native String getSymbol() /*-{ return this.symbol; }-*/; // <span style="color:black;">**(3)**</span>
    public final native double getPrice() /*-{ return this.price; }-*/;
    public final native double getChange() /*-{ return this.change; }-*/;

    // Non-JSNI method to return change percentage.                       // <span style="color:black;">**(4)**</span>
    public final double getChangePercent() {
        return 100.0 * getChange() / getPrice();
    }
}
