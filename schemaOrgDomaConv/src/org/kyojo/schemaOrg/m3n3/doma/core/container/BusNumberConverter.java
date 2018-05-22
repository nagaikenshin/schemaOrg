package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BUS_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.BusNumber;

@ExternalDomain
public class BusNumberConverter implements DomainConverter<BusNumber, String> {

	@Override
	public String fromDomainToValue(BusNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public BusNumber fromValueToDomain(String value) {
		return new BUS_NUMBER(value);
	}

}
