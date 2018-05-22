package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TRACKING_URL;
import org.kyojo.schemaOrg.m3n3.core.Container.TrackingUrl;

@ExternalDomain
public class TrackingUrlConverter implements DomainConverter<TrackingUrl, String> {

	@Override
	public String fromDomainToValue(TrackingUrl domain) {
		return domain.getNativeValue();
	}

	@Override
	public TrackingUrl fromValueToDomain(String value) {
		return new TRACKING_URL(value);
	}

}
