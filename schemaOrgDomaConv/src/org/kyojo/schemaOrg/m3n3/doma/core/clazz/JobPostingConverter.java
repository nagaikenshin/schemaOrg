package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.JOB_POSTING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.JobPosting;

@ExternalDomain
public class JobPostingConverter implements DomainConverter<JobPosting, String> {

	@Override
	public String fromDomainToValue(JobPosting domain) {
		return domain.getNativeValue();
	}

	@Override
	public JobPosting fromValueToDomain(String value) {
		return new JOB_POSTING(value);
	}

}
