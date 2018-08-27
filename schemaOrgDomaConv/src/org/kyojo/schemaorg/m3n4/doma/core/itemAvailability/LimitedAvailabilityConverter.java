package org.kyojo.schemaorg.m3n4.doma.core.itemAvailability;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.itemAvailability.LIMITED_AVAILABILITY;
import org.kyojo.schemaorg.m3n4.core.ItemAvailability.LimitedAvailability;

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
