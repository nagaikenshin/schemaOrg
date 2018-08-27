package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.DOSE_SCHEDULE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.DoseSchedule;

@ExternalDomain
public class DoseScheduleConverter implements DomainConverter<DoseSchedule, String> {

	@Override
	public String fromDomainToValue(DoseSchedule domain) {
		return domain.getNativeValue();
	}

	@Override
	public DoseSchedule fromValueToDomain(String value) {
		return new DOSE_SCHEDULE(value);
	}

}
