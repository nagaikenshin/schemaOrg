package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BLOG;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Blog;

@ExternalDomain
public class BlogConverter implements DomainConverter<Blog, String> {

	@Override
	public String fromDomainToValue(Blog domain) {
		return domain.getNativeValue();
	}

	@Override
	public Blog fromValueToDomain(String value) {
		return new BLOG(value);
	}

}
