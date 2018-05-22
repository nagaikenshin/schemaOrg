package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AMENITY_FEATURE;
import org.kyojo.schemaOrg.m3n3.core.Container.AmenityFeature;

@ExternalDomain
public class AmenityFeatureConverter implements DomainConverter<AmenityFeature, String> {

	@Override
	public String fromDomainToValue(AmenityFeature domain) {
		return domain.getNativeValue();
	}

	@Override
	public AmenityFeature fromValueToDomain(String value) {
		return new AMENITY_FEATURE(value);
	}

}
