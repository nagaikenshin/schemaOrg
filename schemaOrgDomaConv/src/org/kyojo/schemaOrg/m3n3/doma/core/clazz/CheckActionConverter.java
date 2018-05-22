package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHECK_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CheckAction;

@ExternalDomain
public class CheckActionConverter implements DomainConverter<CheckAction, String> {

	@Override
	public String fromDomainToValue(CheckAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckAction fromValueToDomain(String value) {
		return new CHECK_ACTION(value);
	}

}
