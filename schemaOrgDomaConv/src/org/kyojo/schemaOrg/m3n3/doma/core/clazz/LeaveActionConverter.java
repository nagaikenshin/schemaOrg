package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LEAVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LeaveAction;

@ExternalDomain
public class LeaveActionConverter implements DomainConverter<LeaveAction, String> {

	@Override
	public String fromDomainToValue(LeaveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public LeaveAction fromValueToDomain(String value) {
		return new LEAVE_ACTION(value);
	}

}
