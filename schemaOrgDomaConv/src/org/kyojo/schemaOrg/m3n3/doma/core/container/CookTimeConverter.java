package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COOK_TIME;
import org.kyojo.schemaOrg.m3n3.core.Container.CookTime;

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
