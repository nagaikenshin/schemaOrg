package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLISHED_ON;
import org.kyojo.schemaOrg.m3n3.core.Container.PublishedOn;

@ExternalDomain
public class PublishedOnConverter implements DomainConverter<PublishedOn, String> {

	@Override
	public String fromDomainToValue(PublishedOn domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublishedOn fromValueToDomain(String value) {
		return new PUBLISHED_ON(value);
	}

}
