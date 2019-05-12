package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LOCATION_FEATURE_SPECIFICATION;
import org.kyojo.schemaorg.m3n5.core.Clazz.LocationFeatureSpecification;

@ExternalDomain
public class LocationFeatureSpecificationConverter implements DomainConverter<LocationFeatureSpecification, String> {

	@Override
	public String fromDomainToValue(LocationFeatureSpecification domain) {
		return domain.getNativeValue();
	}

	@Override
	public LocationFeatureSpecification fromValueToDomain(String value) {
		return new LOCATION_FEATURE_SPECIFICATION(value);
	}

}