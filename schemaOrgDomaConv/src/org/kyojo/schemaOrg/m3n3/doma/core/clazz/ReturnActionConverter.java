package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RETURN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReturnAction;

@ExternalDomain
public class ReturnActionConverter implements DomainConverter<ReturnAction, String> {

	@Override
	public String fromDomainToValue(ReturnAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReturnAction fromValueToDomain(String value) {
		return new RETURN_ACTION(value);
	}

}
