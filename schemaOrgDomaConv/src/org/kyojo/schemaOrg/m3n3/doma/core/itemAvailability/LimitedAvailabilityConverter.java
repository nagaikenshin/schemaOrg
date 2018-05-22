package org.kyojo.schemaOrg.m3n3.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.itemAvailability.LIMITED_AVAILABILITY;
import org.kyojo.schemaOrg.m3n3.core.ItemAvailability.LimitedAvailability;

@ExternalDomain
public class LimitedAvailabilityConverter implements DomainConverter<LimitedAvailability, String> {

	@Override
	public String fromDomainToValue(LimitedAvailability domain) {
		return domain.getNativeValue();
	}

	@Override
	public LimitedAvailability fromValueToDomain(String value) {
		return new LIMITED_AVAILABILITY(value);
	}

}
