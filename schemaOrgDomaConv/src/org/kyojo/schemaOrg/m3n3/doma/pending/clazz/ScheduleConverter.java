package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.SCHEDULE;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.Schedule;

@ExternalDomain
public class ScheduleConverter implements DomainConverter<Schedule, String> {

	@Override
	public String fromDomainToValue(Schedule domain) {
		return domain.getNativeValue();
	}

	@Override
	public Schedule fromValueToDomain(String value) {
		return new SCHEDULE(value);
	}

}
