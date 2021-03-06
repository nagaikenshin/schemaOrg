package org.kyojo.schemaorg.m3n5.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.RECOMMENDED_DOSE_SCHEDULE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Clazz.RecommendedDoseSchedule;

@ExternalDomain
public class RecommendedDoseScheduleConverter implements DomainConverter<RecommendedDoseSchedule, String> {

	@Override
	public String fromDomainToValue(RecommendedDoseSchedule domain) {
		return domain.getNativeValue();
	}

	@Override
	public RecommendedDoseSchedule fromValueToDomain(String value) {
		return new RECOMMENDED_DOSE_SCHEDULE(value);
	}

}
