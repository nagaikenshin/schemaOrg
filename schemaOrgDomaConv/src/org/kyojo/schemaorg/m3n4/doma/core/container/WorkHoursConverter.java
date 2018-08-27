package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WORK_HOURS;
import org.kyojo.schemaorg.m3n4.core.Container.WorkHours;

@ExternalDomain
public class WorkHoursConverter implements DomainConverter<WorkHours, String> {

	@Override
	public String fromDomainToValue(WorkHours domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkHours fromValueToDomain(String value) {
		return new WORK_HOURS(value);
	}

}
