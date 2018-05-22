package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAVEL_AGENCY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TravelAgency;

@ExternalDomain
public class TravelAgencyConverter implements DomainConverter<TravelAgency, String> {

	@Override
	public String fromDomainToValue(TravelAgency domain) {
		return domain.getNativeValue();
	}

	@Override
	public TravelAgency fromValueToDomain(String value) {
		return new TRAVEL_AGENCY(value);
	}

}
