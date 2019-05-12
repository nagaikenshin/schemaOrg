package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CONTENT_TYPE;
import org.kyojo.schemaorg.m3n5.core.Container.ContentType;

@ExternalDomain
public class ContentTypeConverter implements DomainConverter<ContentType, String> {

	@Override
	public String fromDomainToValue(ContentType domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContentType fromValueToDomain(String value) {
		return new CONTENT_TYPE(value);
	}

}
