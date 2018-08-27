package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LEAVE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.LeaveAction;

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
