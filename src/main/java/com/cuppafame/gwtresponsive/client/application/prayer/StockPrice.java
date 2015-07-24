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
import java.io.Serializable;

public class StockPrice implements Serializable {

    private static final long serialVersionUID = 1L;
    private String symbol;
    private double price;
    private double change;

    public StockPrice() {
    }

    public StockPrice(String symbol, double price, double change) {
        this.symbol = symbol;
        this.price = price;
        this.change = change;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public double getPrice() {
        return this.price;
    }

    public double getChange() {
        return this.change;
    }

    public double getChangePercent() {
        return 100.0 * this.change / this.price;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setChange(double change) {
        this.change = change;
    }
}
