package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.DIVERSITY_STAFFING_REPORT;
import org.kyojo.schemaorg.m3n5.pending.Container.DiversityStaffingReport;

@ExternalDomain
public class DiversityStaffingReportConverter implements DomainConverter<DiversityStaffingReport, String> {

	@Override
	public String fromDomainToValue(DiversityStaffingReport domain) {
		return domain.getNativeValue();
	}

	@Override
	public DiversityStaffingReport fromValueToDomain(String value) {
		return new DIVERSITY_STAFFING_REPORT(value);
	}

}
