package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.FLOOR_LIMIT;
import org.kyojo.schemaOrg.m3n3.pending.Container.FloorLimit;

@ExternalDomain
public class FloorLimitConverter implements DomainConverter<FloorLimit, String> {

	@Override
	public String fromDomainToValue(FloorLimit domain) {
		return domain.getNativeValue();
	}

	@Override
	public FloorLimit fromValueToDomain(String value) {
		return new FLOOR_LIMIT(value);
	}

}
