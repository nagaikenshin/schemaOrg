package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FLOOR_SIZE;
import org.kyojo.schemaorg.m3n5.core.Container.FloorSize;

@ExternalDomain
public class FloorSizeConverter implements DomainConverter<FloorSize, String> {

	@Override
	public String fromDomainToValue(FloorSize domain) {
		return domain.getNativeValue();
	}

	@Override
	public FloorSize fromValueToDomain(String value) {
		return new FLOOR_SIZE(value);
	}

}
