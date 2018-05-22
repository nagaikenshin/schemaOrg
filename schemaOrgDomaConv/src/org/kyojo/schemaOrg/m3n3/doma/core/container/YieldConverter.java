package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.YIELD;
import org.kyojo.schemaOrg.m3n3.core.Container.Yield;

@ExternalDomain
public class YieldConverter implements DomainConverter<Yield, String> {

	@Override
	public String fromDomainToValue(Yield domain) {
		return domain.getNativeValue();
	}

	@Override
	public Yield fromValueToDomain(String value) {
		return new YIELD(value);
	}

}
