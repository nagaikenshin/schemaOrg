package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OFFERS;
import org.kyojo.schemaorg.m3n4.core.Container.Offers;

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
