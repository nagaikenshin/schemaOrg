package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CORPORATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.Corporation;

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
