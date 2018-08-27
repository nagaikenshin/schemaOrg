package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.JOB_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.JobLocation;

@ExternalDomain
public class JobLocationConverter implements DomainConverter<JobLocation, String> {

	@Override
	public String fromDomainToValue(JobLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public JobLocation fromValueToDomain(String value) {
		return new JOB_LOCATION(value);
	}

}
