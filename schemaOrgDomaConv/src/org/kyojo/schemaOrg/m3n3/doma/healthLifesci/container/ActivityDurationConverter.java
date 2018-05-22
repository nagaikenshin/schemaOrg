package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ACTIVITY_DURATION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.ActivityDuration;

@ExternalDomain
public class ActivityDurationConverter implements DomainConverter<ActivityDuration, String> {

	@Override
	public String fromDomainToValue(ActivityDuration domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActivityDuration fromValueToDomain(String value) {
		return new ACTIVITY_DURATION(value);
	}

}
