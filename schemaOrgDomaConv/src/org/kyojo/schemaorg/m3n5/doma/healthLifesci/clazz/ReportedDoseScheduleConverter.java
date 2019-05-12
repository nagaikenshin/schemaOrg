package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.REPORTED_DOSE_SCHEDULE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.ReportedDoseSchedule;

@ExternalDomain
public class ReportedDoseScheduleConverter implements DomainConverter<ReportedDoseSchedule, String> {

	@Override
	public String fromDomainToValue(ReportedDoseSchedule domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReportedDoseSchedule fromValueToDomain(String value) {
		return new REPORTED_DOSE_SCHEDULE(value);
	}

}
