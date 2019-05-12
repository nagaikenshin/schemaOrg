package org.kyojo.schemaorg.m3n5.doma.core.mapCategoryType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.mapCategoryType.TRANSIT_MAP;
import org.kyojo.schemaorg.m3n5.core.MapCategoryType.TransitMap;

@ExternalDomain
public class TransitMapConverter implements DomainConverter<TransitMap, String> {

	@Override
	public String fromDomainToValue(TransitMap domain) {
		return domain.getNativeValue();
	}

	@Override
	public TransitMap fromValueToDomain(String value) {
		return new TRANSIT_MAP(value);
	}

}
