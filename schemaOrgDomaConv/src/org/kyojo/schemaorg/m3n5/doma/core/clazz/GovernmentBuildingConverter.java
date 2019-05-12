package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.GOVERNMENT_BUILDING;
import org.kyojo.schemaorg.m3n5.core.Clazz.GovernmentBuilding;

@ExternalDomain
public class GovernmentBuildingConverter implements DomainConverter<GovernmentBuilding, String> {

	@Override
	public String fromDomainToValue(GovernmentBuilding domain) {
		return domain.getNativeValue();
	}

	@Override
	public GovernmentBuilding fromValueToDomain(String value) {
		return new GOVERNMENT_BUILDING(value);
	}

}
