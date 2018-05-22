package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACCEPTED_OFFER;
import org.kyojo.schemaOrg.m3n3.core.Container.AcceptedOffer;

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
