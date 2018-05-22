package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OFFER_COUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.OfferCount;

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
