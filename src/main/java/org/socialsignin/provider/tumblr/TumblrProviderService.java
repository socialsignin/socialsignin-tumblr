package org.socialsignin.provider.tumblr;

import org.socialsignin.provider.AbstractProviderService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.social.tumblr.api.Tumblr;
import org.springframework.social.tumblr.api.impl.TumblrTemplate;
import org.springframework.stereotype.Service;

@Service
public class TumblrProviderService extends AbstractProviderService<Tumblr> {

	@Override
	public Class<Tumblr> getApiClass() {
		return Tumblr.class;
	}

	@Override
	public Tumblr getUnauthenticatedApi() {
		// Currently TumblrTemplate doesn't support creation without authentication, so no nauthenticated api available as yet
		return null;
	}

}
