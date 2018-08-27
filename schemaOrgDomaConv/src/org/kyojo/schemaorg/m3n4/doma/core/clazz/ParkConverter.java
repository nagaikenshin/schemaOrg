package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PARK;
import org.kyojo.schemaorg.m3n4.core.Clazz.Park;

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
