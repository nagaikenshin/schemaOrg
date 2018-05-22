package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CORPORATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Corporation;

@ExternalDomain
public class CorporationConverter implements DomainConverter<Corporation, String> {

	@Override
	public String fromDomainToValue(Corporation domain) {
		return domain.getNativeValue();
	}

	@Override
	public Corporation fromValueToDomain(String value) {
		return new CORPORATION(value);
	}

}
