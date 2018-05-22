package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LODGING_UNIT_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.LodgingUnitType;

@ExternalDomain
public class LodgingUnitTypeConverter implements DomainConverter<LodgingUnitType, String> {

	@Override
	public String fromDomainToValue(LodgingUnitType domain) {
		return domain.getNativeValue();
	}

	@Override
	public LodgingUnitType fromValueToDomain(String value) {
		return new LODGING_UNIT_TYPE(value);
	}

}
