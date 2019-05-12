package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.MAXIMUM_DOSE_SCHEDULE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.MaximumDoseSchedule;

@ExternalDomain
public class MaximumDoseScheduleConverter implements DomainConverter<MaximumDoseSchedule, String> {

	@Override
	public String fromDomainToValue(MaximumDoseSchedule domain) {
		return domain.getNativeValue();
	}

	@Override
	public MaximumDoseSchedule fromValueToDomain(String value) {
		return new MAXIMUM_DOSE_SCHEDULE(value);
	}

}
