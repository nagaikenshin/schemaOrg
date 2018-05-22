package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LODGING_UNIT_DESCRIPTION;
import org.kyojo.schemaOrg.m3n3.core.Container.LodgingUnitDescription;

@ExternalDomain
public class LodgingUnitDescriptionConverter implements DomainConverter<LodgingUnitDescription, String> {

	@Override
	public String fromDomainToValue(LodgingUnitDescription domain) {
		return domain.getNativeValue();
	}

	@Override
	public LodgingUnitDescription fromValueToDomain(String value) {
		return new LODGING_UNIT_DESCRIPTION(value);
	}

}
