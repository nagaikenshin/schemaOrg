package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.GEOSPATIALLY_CROSSES;
import org.kyojo.schemaorg.m3n4.pending.Container.GeospatiallyCrosses;

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
