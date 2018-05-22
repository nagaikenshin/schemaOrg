package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OFFERS;
import org.kyojo.schemaOrg.m3n3.core.Container.Offers;

@ExternalDomain
public class OffersConverter implements DomainConverter<Offers, String> {

	@Override
	public String fromDomainToValue(Offers domain) {
		return domain.getNativeValue();
	}

	@Override
	public Offers fromValueToDomain(String value) {
		return new OFFERS(value);
	}

}
