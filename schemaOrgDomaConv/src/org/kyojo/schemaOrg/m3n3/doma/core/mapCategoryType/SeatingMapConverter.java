package org.kyojo.schemaOrg.m3n3.doma.core.mapCategoryType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.mapCategoryType.SEATING_MAP;
import org.kyojo.schemaOrg.m3n3.core.MapCategoryType.SeatingMap;

@ExternalDomain
public class SeatingMapConverter implements DomainConverter<SeatingMap, String> {

	@Override
	public String fromDomainToValue(SeatingMap domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeatingMap fromValueToDomain(String value) {
		return new SEATING_MAP(value);
	}

}
