package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BUS_NAME;
import org.kyojo.schemaorg.m3n4.core.Container.BusName;

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
