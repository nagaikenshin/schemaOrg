package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LEGISLATIVE_BUILDING;
import org.kyojo.schemaorg.m3n4.core.Clazz.LegislativeBuilding;

@ExternalDomain
public class LegislativeBuildingConverter implements DomainConverter<LegislativeBuilding, String> {

	@Override
	public String fromDomainToValue(LegislativeBuilding domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislativeBuilding fromValueToDomain(String value) {
		return new LEGISLATIVE_BUILDING(value);
	}

}
