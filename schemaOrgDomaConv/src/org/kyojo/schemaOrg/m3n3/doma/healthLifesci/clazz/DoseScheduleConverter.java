package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DOSE_SCHEDULE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DoseSchedule;

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
