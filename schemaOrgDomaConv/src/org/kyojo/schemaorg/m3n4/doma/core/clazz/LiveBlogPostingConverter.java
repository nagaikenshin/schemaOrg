package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LIVE_BLOG_POSTING;
import org.kyojo.schemaorg.m3n4.core.Clazz.LiveBlogPosting;

@ExternalDomain
public class LiveBlogPostingConverter implements DomainConverter<LiveBlogPosting, String> {

	@Override
	public String fromDomainToValue(LiveBlogPosting domain) {
		return domain.getNativeValue();
	}

	@Override
	public LiveBlogPosting fromValueToDomain(String value) {
		return new LIVE_BLOG_POSTING(value);
	}

}
