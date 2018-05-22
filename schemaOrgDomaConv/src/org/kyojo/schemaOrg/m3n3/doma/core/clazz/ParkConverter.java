package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARK;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Park;

@ExternalDomain
public class ParkConverter implements DomainConverter<Park, String> {

	@Override
	public String fromDomainToValue(Park domain) {
		return domain.getNativeValue();
	}

	@Override
	public Park fromValueToDomain(String value) {
		return new PARK(value);
	}

}
