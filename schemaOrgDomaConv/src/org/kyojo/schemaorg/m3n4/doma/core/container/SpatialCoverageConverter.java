package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.SPATIAL_COVERAGE;
import org.kyojo.schemaorg.m3n4.core.Container.SpatialCoverage;

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
