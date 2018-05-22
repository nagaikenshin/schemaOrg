package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHECK_OUT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CheckOutAction;

@ExternalDomain
public class CheckOutActionConverter implements DomainConverter<CheckOutAction, String> {

	@Override
	public String fromDomainToValue(CheckOutAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckOutAction fromValueToDomain(String value) {
		return new CHECK_OUT_ACTION(value);
	}

}
