package com.shsxt.plugin;

import java.util.Properties;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;

/**
 * 模拟拦截器
 * 
 * 
 * @author Mr.YongGan.Zhang
 * @versin 1.0.0
 * @since JDK1.8
 */
@Intercepts({
	@Signature(
			type = Executor.class,
			method = "query",
			args={MappedStatement.class,Object.class,RowBounds.class,ResultHandler.class}
			) 
}) 
public class ExamplePlugin implements Interceptor {

	/**
	 * 插件拦截点
	 */
	public Object intercept(Invocation invocation) throws Throwable {

		System.out.println("插件拦截。。。。");

		return invocation.proceed();
	}

	/**
	 * Object plugin(Object target) 
	 * 		就是用当前这个拦截器生成对目标target的代理，
	 * 
	 * 实际是通过Plugin.wrap(target,this) 来完成的，
	 * 		把目标target和拦截器this传给了包装函数。
	 */
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	public void setProperties(Properties properties) {

	}

}
