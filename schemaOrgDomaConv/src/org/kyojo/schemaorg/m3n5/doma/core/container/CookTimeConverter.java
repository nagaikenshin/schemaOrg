package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.COOK_TIME;
import org.kyojo.schemaorg.m3n5.core.Container.CookTime;

@ExternalDomain
public class CookTimeConverter implements DomainConverter<CookTime, String> {

	@Override
	public String fromDomainToValue(CookTime domain) {
		return domain.getNativeValue();
	}

	@Override
	public CookTime fromValueToDomain(String value) {
		return new COOK_TIME(value);
	}

}
