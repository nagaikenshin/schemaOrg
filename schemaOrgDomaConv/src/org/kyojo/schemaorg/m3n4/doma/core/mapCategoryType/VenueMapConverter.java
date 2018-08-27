package org.kyojo.schemaorg.m3n4.doma.core.mapCategoryType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.mapCategoryType.VENUE_MAP;
import org.kyojo.schemaorg.m3n4.core.MapCategoryType.VenueMap;

@ExternalDomain
public class VenueMapConverter implements DomainConverter<VenueMap, String> {

	@Override
	public String fromDomainToValue(VenueMap domain) {
		return domain.getNativeValue();
	}

	@Override
	public VenueMap fromValueToDomain(String value) {
		return new VENUE_MAP(value);
	}

}
