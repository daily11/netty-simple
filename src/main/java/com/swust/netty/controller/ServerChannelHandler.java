package com.swust.netty.controller;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 一个自定义的服务端接收类，SimpleChannelInboundHandler里面的参数可以是自定义的其他类
 */
public class ServerChannelHandler extends SimpleChannelInboundHandler<String> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        System.out.println("服务端接收到信息：" + msg);
        ctx.channel().writeAndFlush("好好干，我不会亏待你的！");
    }
}
