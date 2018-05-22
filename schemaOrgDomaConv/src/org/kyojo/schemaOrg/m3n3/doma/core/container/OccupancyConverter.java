package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.OCCUPANCY;
import org.kyojo.schemaOrg.m3n3.core.Container.Occupancy;

@ExternalDomain
public class OccupancyConverter implements DomainConverter<Occupancy, String> {

	@Override
	public String fromDomainToValue(Occupancy domain) {
		return domain.getNativeValue();
	}

	@Override
	public Occupancy fromValueToDomain(String value) {
		return new OCCUPANCY(value);
	}

}
