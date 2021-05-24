package com.imooc.netty;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.channel.ChannelPipeline;

public class HelloServerInitializer extends ChannelInitializer<SocketChannel>{

	@Override
	protected void initChannel(SocketChannel channel) throws Exception {

		ChannelPipeline pipeline = channel.pipeline();
		pipeline.addLast("HttpServerCodec",new HttpServerCodec());
		pipeline.addLast("customHandler",new CustomHandler());
		
	}

}
