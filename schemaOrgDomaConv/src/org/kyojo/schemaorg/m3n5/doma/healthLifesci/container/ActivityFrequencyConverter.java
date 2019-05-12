package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.ACTIVITY_FREQUENCY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.ActivityFrequency;

@ExternalDomain
public class ActivityFrequencyConverter implements DomainConverter<ActivityFrequency, String> {

	@Override
	public String fromDomainToValue(ActivityFrequency domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActivityFrequency fromValueToDomain(String value) {
		return new ACTIVITY_FREQUENCY(value);
	}

}
