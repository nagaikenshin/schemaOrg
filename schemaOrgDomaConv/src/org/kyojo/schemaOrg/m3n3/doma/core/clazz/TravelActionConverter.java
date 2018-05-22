package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRAVEL_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.TravelAction;

@ExternalDomain
public class TravelActionConverter implements DomainConverter<TravelAction, String> {

	@Override
	public String fromDomainToValue(TravelAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public TravelAction fromValueToDomain(String value) {
		return new TRAVEL_ACTION(value);
	}

}
