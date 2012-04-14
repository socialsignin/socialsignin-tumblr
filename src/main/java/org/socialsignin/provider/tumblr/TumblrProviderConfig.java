/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.socialsignin.provider.tumblr;

import org.socialsignin.provider.AbstractProviderConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.connect.ConnectionFactory;
import org.springframework.social.connect.web.ConnectInterceptor;
import org.springframework.social.tumblr.api.Tumblr;
import org.springframework.social.tumblr.connect.TumblrConnectionFactory;
/**
* @author Michael Lavelle
*/
@Configuration
public class TumblrProviderConfig extends AbstractProviderConfig<Tumblr> {

	@Autowired
	private TumblrConnectInterceptor tumblrConnectInterceptor;

	@Value("${tumblr.consumerKey}")
	private String tumblrConsumerKey;
	
	@Value("${tumblr.consumerSecret}")
	private String tumblrConsumerSecret;
	

	@Override
	protected ConnectionFactory<Tumblr> createConnectionFactory() {
		return new TumblrConnectionFactory(tumblrConsumerKey,
				tumblrConsumerSecret);
	}

	@Override
	protected ConnectInterceptor<Tumblr> getConnectInterceptor() {
		return tumblrConnectInterceptor;
	}

}
