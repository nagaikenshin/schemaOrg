package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.OFFER;
import org.kyojo.schemaorg.m3n5.core.Clazz.Offer;

@ExternalDomain
public class OfferConverter implements DomainConverter<Offer, String> {

	@Override
	public String fromDomainToValue(Offer domain) {
		return domain.getNativeValue();
	}

	@Override
	public Offer fromValueToDomain(String value) {
		return new OFFER(value);
	}

}
