package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SPATIAL_COVERAGE;
import org.kyojo.schemaOrg.m3n3.core.Container.SpatialCoverage;

@ExternalDomain
public class SpatialCoverageConverter implements DomainConverter<SpatialCoverage, String> {

	@Override
	public String fromDomainToValue(SpatialCoverage domain) {
		return domain.getNativeValue();
	}

	@Override
	public SpatialCoverage fromValueToDomain(String value) {
		return new SPATIAL_COVERAGE(value);
	}

}
