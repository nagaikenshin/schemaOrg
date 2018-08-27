package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PICKUP_LOCATION;
import org.kyojo.schemaorg.m3n4.core.Container.PickupLocation;

@ExternalDomain
public class PickupLocationConverter implements DomainConverter<PickupLocation, String> {

	@Override
	public String fromDomainToValue(PickupLocation domain) {
		return domain.getNativeValue();
	}

	@Override
	public PickupLocation fromValueToDomain(String value) {
		return new PICKUP_LOCATION(value);
	}

}
