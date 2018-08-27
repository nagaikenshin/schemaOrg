package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PUBLISHER;
import org.kyojo.schemaorg.m3n4.core.Container.Publisher;

@ExternalDomain
public class PublisherConverter implements DomainConverter<Publisher, String> {

	@Override
	public String fromDomainToValue(Publisher domain) {
		return domain.getNativeValue();
	}

	@Override
	public Publisher fromValueToDomain(String value) {
		return new PUBLISHER(value);
	}

}
