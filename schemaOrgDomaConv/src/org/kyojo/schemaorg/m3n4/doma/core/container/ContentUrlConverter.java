package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONTENT_URL;
import org.kyojo.schemaorg.m3n4.core.Container.ContentUrl;

@ExternalDomain
public class ContentUrlConverter implements DomainConverter<ContentUrl, String> {

	@Override
	public String fromDomainToValue(ContentUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContentUrl fromValueToDomain(String value) {
		return new CONTENT_URL(value);
	}

}
