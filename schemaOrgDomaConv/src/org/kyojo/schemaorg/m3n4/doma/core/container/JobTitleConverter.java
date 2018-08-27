package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.JOB_TITLE;
import org.kyojo.schemaorg.m3n4.core.Container.JobTitle;

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
