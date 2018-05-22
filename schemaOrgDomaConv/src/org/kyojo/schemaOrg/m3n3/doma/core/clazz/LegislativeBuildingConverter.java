package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LEGISLATIVE_BUILDING;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LegislativeBuilding;

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
