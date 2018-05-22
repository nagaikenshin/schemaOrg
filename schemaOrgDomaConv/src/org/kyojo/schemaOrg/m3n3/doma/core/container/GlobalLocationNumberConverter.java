package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.GLOBAL_LOCATION_NUMBER;
import org.kyojo.schemaOrg.m3n3.core.Container.GlobalLocationNumber;

@ExternalDomain
public class GlobalLocationNumberConverter implements DomainConverter<GlobalLocationNumber, String> {

	@Override
	public String fromDomainToValue(GlobalLocationNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public GlobalLocationNumber fromValueToDomain(String value) {
		return new GLOBAL_LOCATION_NUMBER(value);
	}

}
