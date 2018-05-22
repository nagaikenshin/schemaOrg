package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.JOB_BENEFITS;
import org.kyojo.schemaOrg.m3n3.core.Container.JobBenefits;

@ExternalDomain
public class JobBenefitsConverter implements DomainConverter<JobBenefits, String> {

	@Override
	public String fromDomainToValue(JobBenefits domain) {
		return domain.getNativeValue();
	}

	@Override
	public JobBenefits fromValueToDomain(String value) {
		return new JOB_BENEFITS(value);
	}

}
