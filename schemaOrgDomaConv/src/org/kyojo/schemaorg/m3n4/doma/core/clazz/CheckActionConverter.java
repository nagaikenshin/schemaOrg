package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHECK_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.CheckAction;

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
