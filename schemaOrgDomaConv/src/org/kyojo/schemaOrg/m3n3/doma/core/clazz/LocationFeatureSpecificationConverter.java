package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LOCATION_FEATURE_SPECIFICATION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LocationFeatureSpecification;

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
