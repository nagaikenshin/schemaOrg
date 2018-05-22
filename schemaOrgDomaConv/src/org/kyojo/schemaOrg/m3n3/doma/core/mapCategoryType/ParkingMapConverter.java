package org.kyojo.schemaOrg.m3n3.doma.core.mapCategoryType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.mapCategoryType.PARKING_MAP;
import org.kyojo.schemaOrg.m3n3.core.MapCategoryType.ParkingMap;

@ExternalDomain
public class ParkingMapConverter implements DomainConverter<ParkingMap, String> {

	@Override
	public String fromDomainToValue(ParkingMap domain) {
		return domain.getNativeValue();
	}

	@Override
	public ParkingMap fromValueToDomain(String value) {
		return new PARKING_MAP(value);
	}

}
