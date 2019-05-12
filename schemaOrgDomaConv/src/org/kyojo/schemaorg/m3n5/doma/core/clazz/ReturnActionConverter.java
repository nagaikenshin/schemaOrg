package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.RETURN_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.ReturnAction;

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
