package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AGGREGATE_OFFER;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AggregateOffer;

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
