package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RV_PARK;
import org.kyojo.schemaorg.m3n4.core.Clazz.RVPark;

@ExternalDomain
public class RVParkConverter implements DomainConverter<RVPark, String> {

	@Override
	public String fromDomainToValue(RVPark domain) {
		return domain.getNativeValue();
	}

	@Override
	public RVPark fromValueToDomain(String value) {
		return new RV_PARK(value);
	}

}
