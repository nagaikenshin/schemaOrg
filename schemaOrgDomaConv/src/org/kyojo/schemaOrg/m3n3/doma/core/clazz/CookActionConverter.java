package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.COOK_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CookAction;

@ExternalDomain
public class CookActionConverter implements DomainConverter<CookAction, String> {

	@Override
	public String fromDomainToValue(CookAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CookAction fromValueToDomain(String value) {
		return new COOK_ACTION(value);
	}

}
