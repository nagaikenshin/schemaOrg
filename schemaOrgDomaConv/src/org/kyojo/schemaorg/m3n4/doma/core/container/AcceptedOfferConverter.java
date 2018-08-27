package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACCEPTED_OFFER;
import org.kyojo.schemaorg.m3n4.core.Container.AcceptedOffer;

@ExternalDomain
public class AcceptedOfferConverter implements DomainConverter<AcceptedOffer, String> {

	@Override
	public String fromDomainToValue(AcceptedOffer domain) {
		return domain.getNativeValue();
	}

	@Override
	public AcceptedOffer fromValueToDomain(String value) {
		return new ACCEPTED_OFFER(value);
	}

}
