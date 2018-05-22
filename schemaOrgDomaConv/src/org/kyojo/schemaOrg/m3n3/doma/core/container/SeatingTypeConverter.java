package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEATING_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Container.SeatingType;

@ExternalDomain
public class SeatingTypeConverter implements DomainConverter<SeatingType, String> {

	@Override
	public String fromDomainToValue(SeatingType domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeatingType fromValueToDomain(String value) {
		return new SEATING_TYPE(value);
	}

}
