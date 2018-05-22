package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.REPORTED_DOSE_SCHEDULE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.ReportedDoseSchedule;

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
