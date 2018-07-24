package com.camel.server.dynamic.dynamic_4;

import org.apache.camel.builder.RouteBuilder;

public class DirectRouteB extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		// 第二个路由和第三个路由的代码都相似
		// 唯一不同的是类型
		from("direct:directRouteB").to("log:DirectRouteB?showExchangeId=true");

	}

}