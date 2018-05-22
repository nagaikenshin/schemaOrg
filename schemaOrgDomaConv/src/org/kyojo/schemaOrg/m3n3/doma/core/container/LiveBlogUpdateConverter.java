package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LIVE_BLOG_UPDATE;
import org.kyojo.schemaOrg.m3n3.core.Container.LiveBlogUpdate;

@ExternalDomain
public class LiveBlogUpdateConverter implements DomainConverter<LiveBlogUpdate, String> {

	@Override
	public String fromDomainToValue(LiveBlogUpdate domain) {
		return domain.getNativeValue();
	}

	@Override
	public LiveBlogUpdate fromValueToDomain(String value) {
		return new LIVE_BLOG_UPDATE(value);
	}

}
