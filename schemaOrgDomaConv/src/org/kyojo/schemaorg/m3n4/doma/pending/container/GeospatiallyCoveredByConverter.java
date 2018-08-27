package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_COVERED_BY;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCoveredBy;

@ExternalDomain
public class GeospatiallyCoveredByConverter implements DomainConverter<GeospatiallyCoveredBy, String> {

	@Override
	public String fromDomainToValue(GeospatiallyCoveredBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyCoveredBy fromValueToDomain(String value) {
		return new GEOSPATIALLY_COVERED_BY(value);
	}

}
