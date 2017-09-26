package com.scossi.design.iterator;

/**
 * Created by gabriel on 16/09/17.
 */
public class Channel {
    private double frequency;
    private ChannelTypeEnum type;

    public Channel(double frequency, ChannelTypeEnum type) {
        this.frequency = frequency;
        this.type = type;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public ChannelTypeEnum getType() {
        return type;
    }

    public void setType(ChannelTypeEnum type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "frequency=" + frequency +
                ", type=" + type +
                '}';
    }
}
