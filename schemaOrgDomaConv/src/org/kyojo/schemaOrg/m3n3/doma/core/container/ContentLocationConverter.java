package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONTENT_LOCATION;
import org.kyojo.schemaOrg.m3n3.core.Container.ContentLocation;

@ExternalDomain
public class ContentLocationConverter implements DomainConverter<ContentLocation, String> {

	@Override
	public String fromDomainToValue(ContentLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public ContentLocation fromValueToDomain(String value) {
		return new CONTENT_LOCATION(value);
	}

}
