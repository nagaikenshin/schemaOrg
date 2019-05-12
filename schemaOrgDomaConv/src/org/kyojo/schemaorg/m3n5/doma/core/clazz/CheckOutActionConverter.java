package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CHECK_OUT_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.CheckOutAction;

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
