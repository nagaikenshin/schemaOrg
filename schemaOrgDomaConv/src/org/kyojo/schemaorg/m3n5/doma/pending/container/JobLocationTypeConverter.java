package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.JOB_LOCATION_TYPE;
import org.kyojo.schemaorg.m3n5.pending.Container.JobLocationType;

@ExternalDomain
public class JobLocationTypeConverter implements DomainConverter<JobLocationType, String> {

	@Override
	public String fromDomainToValue(JobLocationType domain) {
		return domain.getNativeValue();
	}

	@Override
	public JobLocationType fromValueToDomain(String value) {
		return new JOB_LOCATION_TYPE(value);
	}

}
