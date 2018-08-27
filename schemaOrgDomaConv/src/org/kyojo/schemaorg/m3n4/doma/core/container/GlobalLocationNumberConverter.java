package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.GLOBAL_LOCATION_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.GlobalLocationNumber;

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
