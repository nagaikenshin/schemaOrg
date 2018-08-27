package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BLOG_POSTING;
import org.kyojo.schemaorg.m3n4.core.Clazz.BlogPosting;

@ExternalDomain
public class BlogPostingConverter implements DomainConverter<BlogPosting, String> {

	@Override
	public String fromDomainToValue(BlogPosting domain) {
		return domain.getNativeValue();
	}

	@Override
	public BlogPosting fromValueToDomain(String value) {
		return new BLOG_POSTING(value);
	}

}
