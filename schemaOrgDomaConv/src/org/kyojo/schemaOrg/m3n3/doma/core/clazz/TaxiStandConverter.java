package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TAXI_STAND;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TaxiStand;

@ExternalDomain
public class TaxiStandConverter implements DomainConverter<TaxiStand, String> {

	@Override
	public String fromDomainToValue(TaxiStand domain) {
		return domain.getNativeValue();
	}

	@Override
	public TaxiStand fromValueToDomain(String value) {
		return new TAXI_STAND(value);
	}

}
