package com.demo.oauth.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

/**
 * 获取token
 *
 * @author wwchang
 * @date 2017/11/29 22:36
 **/
@Configuration
@EnableAuthorizationServer
public class Oauth2Config extends AuthorizationServerConfigurerAdapter {

	/**
	 *  客户端模式 memory 模式存储
	 */
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory()
				.withClient("client")
				.secret("secret")
				.authorizedGrantTypes("client_credentials")
				.scopes("app");
		super.configure(clients);
	}
	/**
	 *  密码模式 memory 模式存储
	 */
//	@Override
//	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//		clients.inMemory()
//				.withClient("client")
//				.secret("secret")
//				.autoApprove(true)
//				.authorizedGrantTypes(OAuth2Constants.GRANT_TYPE_PASSWORD)
//				.scopes("app");
//		super.configure(clients);
//	}
//	@Override
//	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
//		super.configure(endpoints);
//	}
}
