package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CREDITED_TO;
import org.kyojo.schemaorg.m3n5.core.Container.CreditedTo;

@ExternalDomain
public class CreditedToConverter implements DomainConverter<CreditedTo, String> {

	@Override
	public String fromDomainToValue(CreditedTo domain) {
		return domain.getNativeValue();
	}

	@Override
	public CreditedTo fromValueToDomain(String value) {
		return new CREDITED_TO(value);
	}

}