package com.polozov.cloudrouter.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

@Component
public class CustomZuulFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return FilterConstants.POST_TYPE; // определяем КОГДА применяется фильтр к http-request
	}

	@Override
	public int filterOrder() {
		return FilterConstants.DEBUG_FILTER_ORDER; // задаем порядок
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public Object run() throws ZuulException { // основное действие
		RequestContext context = RequestContext.getCurrentContext();
		context.addZuulResponseHeader("X-zuul-return-message", "test value");
		return null;
	}
}
