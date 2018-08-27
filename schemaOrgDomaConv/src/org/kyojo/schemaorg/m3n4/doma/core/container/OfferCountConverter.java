package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.OFFER_COUNT;
import org.kyojo.schemaorg.m3n4.core.Container.OfferCount;

@ExternalDomain
public class OfferCountConverter implements DomainConverter<OfferCount, Long> {

	@Override
	public Long fromDomainToValue(OfferCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfferCount fromValueToDomain(Long value) {
		return new OFFER_COUNT(value);
	}

}