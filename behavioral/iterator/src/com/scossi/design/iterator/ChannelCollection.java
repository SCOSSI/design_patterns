package com.scossi.design.iterator;

/**
 * Created by gabriel on 16/09/17.
 */
public interface ChannelCollection {
    public void addChannel(Channel c);

    public void removeChannel(Channel c);

    public ChannelIterator iterator(ChannelTypeEnum type);
}
