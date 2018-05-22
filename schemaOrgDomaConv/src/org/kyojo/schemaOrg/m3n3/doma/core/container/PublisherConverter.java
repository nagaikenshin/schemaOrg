package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PUBLISHER;
import org.kyojo.schemaOrg.m3n3.core.Container.Publisher;

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
