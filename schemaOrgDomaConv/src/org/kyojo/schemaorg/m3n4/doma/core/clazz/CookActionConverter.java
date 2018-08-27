package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.COOK_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.CookAction;

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
