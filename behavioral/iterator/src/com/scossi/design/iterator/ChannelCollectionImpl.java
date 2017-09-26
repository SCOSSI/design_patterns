package com.scossi.design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gabriel on 16/09/17.
 */
public class ChannelCollectionImpl implements ChannelCollection {
    List<Channel> channels;

    public ChannelCollectionImpl() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addChannel(Channel channel) {
        channels.add(channel);
    }

    @Override
    public void removeChannel(Channel channel) {
        channels.remove(channel);
    }

    @Override
    public ChannelIterator iterator(ChannelTypeEnum type) {
        return new ChannelIteratorImpl(type, channels);
    }

    private class ChannelIteratorImpl implements ChannelIterator{
        private ChannelTypeEnum channelType;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum channelType, List<Channel> channels) {
            this.channelType = channelType;
            this.channels = channels;
        }

        @Override
        public boolean hasNext() {
            while (position<channels.size()){
                Channel channel = channels.get(position);
                if(channel.getType().equals(channelType) || channelType.equals(ChannelTypeEnum.ALL))
                    return true;
                else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel channel = channels.get(position);
            position++;
            return channel;
        }
    }
}
