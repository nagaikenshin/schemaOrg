package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.LANDMARKS_OR_HISTORICAL_BUILDINGS;
import org.kyojo.schemaorg.m3n5.core.Clazz.LandmarksOrHistoricalBuildings;

@ExternalDomain
public class LandmarksOrHistoricalBuildingsConverter implements DomainConverter<LandmarksOrHistoricalBuildings, String> {

	@Override
	public String fromDomainToValue(LandmarksOrHistoricalBuildings domain) {
		return domain.getNativeValue();
	}

	@Override
	public LandmarksOrHistoricalBuildings fromValueToDomain(String value) {
		return new LANDMARKS_OR_HISTORICAL_BUILDINGS(value);
	}

}
