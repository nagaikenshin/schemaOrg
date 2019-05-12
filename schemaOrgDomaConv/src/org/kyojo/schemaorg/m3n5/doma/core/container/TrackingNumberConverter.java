package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TRACKING_NUMBER;
import org.kyojo.schemaorg.m3n5.core.Container.TrackingNumber;

@ExternalDomain
public class TrackingNumberConverter implements DomainConverter<TrackingNumber, String> {

	@Override
	public String fromDomainToValue(TrackingNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrackingNumber fromValueToDomain(String value) {
		return new TRACKING_NUMBER(value);
	}

}
