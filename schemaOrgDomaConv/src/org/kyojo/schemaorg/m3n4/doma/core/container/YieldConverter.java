package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.YIELD;
import org.kyojo.schemaorg.m3n4.core.Container.Yield;

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
