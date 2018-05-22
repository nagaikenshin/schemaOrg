package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUS_NAME;
import org.kyojo.schemaOrg.m3n3.core.Container.BusName;

@ExternalDomain
public class BusNameConverter implements DomainConverter<BusName, String> {

	@Override
	public String fromDomainToValue(BusName domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusName fromValueToDomain(String value) {
		return new BUS_NAME(value);
	}

}
