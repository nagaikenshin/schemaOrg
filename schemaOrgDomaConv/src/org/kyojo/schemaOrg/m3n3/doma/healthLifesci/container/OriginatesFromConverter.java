package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ORIGINATES_FROM;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.OriginatesFrom;

@ExternalDomain
public class OriginatesFromConverter implements DomainConverter<OriginatesFrom, String> {

	@Override
	public String fromDomainToValue(OriginatesFrom domain) {
		return domain.getNativeValue();
	}

	@Override
	public OriginatesFrom fromValueToDomain(String value) {
		return new ORIGINATES_FROM(value);
	}

}
