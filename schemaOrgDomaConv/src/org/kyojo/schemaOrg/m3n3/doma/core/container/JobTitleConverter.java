package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.JOB_TITLE;
import org.kyojo.schemaOrg.m3n3.core.Container.JobTitle;

@ExternalDomain
public class JobTitleConverter implements DomainConverter<JobTitle, String> {

	@Override
	public String fromDomainToValue(JobTitle domain) {
		return domain.getNativeValue();
	}

	@Override
	public JobTitle fromValueToDomain(String value) {
		return new JOB_TITLE(value);
	}

}
