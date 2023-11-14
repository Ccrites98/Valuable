package com.pluralsight.finance;
public abstract class FixedAsset extends Valuable {
    private String name;
    private double marketValue;
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
    @Override
    public double getValue() {
        return marketValue;
    }
}