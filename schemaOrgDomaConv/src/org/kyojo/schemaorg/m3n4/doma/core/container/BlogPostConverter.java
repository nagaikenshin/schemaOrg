package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BLOG_POST;
import org.kyojo.schemaorg.m3n4.core.Container.BlogPost;

@ExternalDomain
public class BlogPostConverter implements DomainConverter<BlogPost, String> {

	@Override
	public String fromDomainToValue(BlogPost domain) {
		return domain.getNativeValue();
	}

	@Override
	public BlogPost fromValueToDomain(String value) {
		return new BLOG_POST(value);
	}

}
