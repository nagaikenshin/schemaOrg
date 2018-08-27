package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SCHEDULE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ScheduleAction;

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
