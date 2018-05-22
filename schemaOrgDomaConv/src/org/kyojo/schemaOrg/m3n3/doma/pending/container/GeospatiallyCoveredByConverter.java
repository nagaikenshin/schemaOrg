package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_COVERED_BY;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCoveredBy;

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
