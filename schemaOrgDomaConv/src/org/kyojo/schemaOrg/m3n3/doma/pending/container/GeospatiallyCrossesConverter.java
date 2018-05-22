package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.GEOSPATIALLY_CROSSES;
import org.kyojo.schemaOrg.m3n3.pending.Container.GeospatiallyCrosses;

@ExternalDomain
public class GeospatiallyCrossesConverter implements DomainConverter<GeospatiallyCrosses, String> {

	@Override
	public String fromDomainToValue(GeospatiallyCrosses domain) {
		return domain.getNativeValue();
	}

	@Override
	public GeospatiallyCrosses fromValueToDomain(String value) {
		return new GEOSPATIALLY_CROSSES(value);
	}

}
