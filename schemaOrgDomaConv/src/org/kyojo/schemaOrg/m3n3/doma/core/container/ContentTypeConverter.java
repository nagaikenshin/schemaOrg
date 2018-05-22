package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTENT_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.ContentType;

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
