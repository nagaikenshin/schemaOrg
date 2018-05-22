package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SEAT_SECTION;
import org.kyojo.schemaOrg.m3n3.core.Container.SeatSection;

@ExternalDomain
public class SeatSectionConverter implements DomainConverter<SeatSection, String> {

	@Override
	public String fromDomainToValue(SeatSection domain) {
		return domain.getNativeValue();
	}

	@Override
	public SeatSection fromValueToDomain(String value) {
		return new SEAT_SECTION(value);
	}

}
