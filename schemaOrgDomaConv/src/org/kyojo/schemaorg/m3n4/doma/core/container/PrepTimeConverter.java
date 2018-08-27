package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PREP_TIME;
import org.kyojo.schemaorg.m3n4.core.Container.PrepTime;

@ExternalDomain
public class PrepTimeConverter implements DomainConverter<PrepTime, String> {

	@Override
	public String fromDomainToValue(PrepTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public PrepTime fromValueToDomain(String value) {
		return new PREP_TIME(value);
	}

}
