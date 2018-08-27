package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.AGGREGATE_OFFER;
import org.kyojo.schemaorg.m3n4.core.Clazz.AggregateOffer;

@ExternalDomain
public class AggregateOfferConverter implements DomainConverter<AggregateOffer, String> {

	@Override
	public String fromDomainToValue(AggregateOffer domain) {
		return domain.getNativeValue();
	}

	@Override
	public AggregateOffer fromValueToDomain(String value) {
		return new AGGREGATE_OFFER(value);
	}

}
