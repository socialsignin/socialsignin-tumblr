package org.socialsignin.provider.tumblr;

import org.socialsignin.provider.AbstractProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.tumblr.api.Tumblr;
import org.springframework.social.tumblr.api.impl.TumblrTemplate;
import org.springframework.stereotype.Service;

import sun.security.krb5.Config;

@Service
public class TumblrProviderService extends AbstractProviderService<Tumblr,TumblrProviderConfig> {

	

	public TumblrProviderService() {
		super();
	}

	public TumblrProviderService(TumblrProviderConfig providerConfig) {
		super(providerConfig);
	}

	@Override
	public Tumblr getUnauthenticatedApi() {
		return new TumblrTemplate(providerConfig.getTumblrConsumerKey());
	}

}
