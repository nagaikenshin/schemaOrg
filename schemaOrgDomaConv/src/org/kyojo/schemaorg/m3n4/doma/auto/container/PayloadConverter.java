package org.kyojo.schemaorg.m3n4.doma.auto.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.auto.impl.PAYLOAD;
import org.kyojo.schemaorg.m3n4.auto.Container.Payload;

@ExternalDomain
public class PayloadConverter implements DomainConverter<Payload, String> {

	@Override
	public String fromDomainToValue(Payload domain) {
		return domain.getNativeValue();
	}

	@Override
	public Payload fromValueToDomain(String value) {
		return new PAYLOAD(value);
	}

}