package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SCHEDULE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ScheduleAction;

@ExternalDomain
public class ScheduleActionConverter implements DomainConverter<ScheduleAction, String> {

	@Override
	public String fromDomainToValue(ScheduleAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ScheduleAction fromValueToDomain(String value) {
		return new SCHEDULE_ACTION(value);
	}

}
