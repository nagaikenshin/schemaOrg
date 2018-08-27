package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MAKES_OFFER;
import org.kyojo.schemaorg.m3n4.core.Container.MakesOffer;

@ExternalDomain
public class MakesOfferConverter implements DomainConverter<MakesOffer, String> {

	@Override
	public String fromDomainToValue(MakesOffer domain) {
		return domain.getNativeValue();
	}

	@Override
	public MakesOffer fromValueToDomain(String value) {
		return new MAKES_OFFER(value);
	}

}
