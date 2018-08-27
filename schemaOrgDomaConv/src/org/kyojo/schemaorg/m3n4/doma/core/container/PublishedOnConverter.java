package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PUBLISHED_ON;
import org.kyojo.schemaorg.m3n4.core.Container.PublishedOn;

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
