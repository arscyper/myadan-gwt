/*
 * Copyright (c) 2014. Pitney Bowes Software Inc.
 * All Rights Reserved.
 * Confidential Property of Pitney Bowes Software Inc.
 */
package com.cuppafame.gwtresponsive.server.application.prayer;

/**
 * Class Description:
 *
 * @author AR001AF : 7/23/15
 * @version: 1.0
 */
import java.util.ArrayList;
import java.util.Random;


import com.cuppafame.gwtresponsive.client.application.prayer.GreetingService;
import com.cuppafame.gwtresponsive.client.application.prayer.StockPrice;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
        GreetingService {

    @Override
    public StockPrice[] refreshWatchList(ArrayList<String> stocks) {
        final double MAX_PRICE = 100.0; // $100.00
        final double MAX_PRICE_CHANGE = 0.02; // +/- 2%

        StockPrice[] prices = new StockPrice[stocks.size()];
        for (int i = 0; i < stocks.size(); i++) {
            double price = new Random().nextDouble() * MAX_PRICE;
            double change = price * MAX_PRICE_CHANGE
                    * (new Random().nextDouble() * 2.0 - 1.0);

            prices[i] = new StockPrice(stocks.get(i), price, change);
        }
        return prices;
    }

}
