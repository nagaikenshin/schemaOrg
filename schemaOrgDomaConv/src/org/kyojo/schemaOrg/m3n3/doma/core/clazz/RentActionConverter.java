package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RENT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.RentAction;

@ExternalDomain
public class RentActionConverter implements DomainConverter<RentAction, String> {

	@Override
	public String fromDomainToValue(RentAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public RentAction fromValueToDomain(String value) {
		return new RENT_ACTION(value);
	}

}
