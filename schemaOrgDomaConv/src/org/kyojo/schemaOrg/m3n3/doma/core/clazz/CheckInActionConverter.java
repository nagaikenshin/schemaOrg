package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHECK_IN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CheckInAction;

@ExternalDomain
public class CheckInActionConverter implements DomainConverter<CheckInAction, String> {

	@Override
	public String fromDomainToValue(CheckInAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CheckInAction fromValueToDomain(String value) {
		return new CHECK_IN_ACTION(value);
	}

}
