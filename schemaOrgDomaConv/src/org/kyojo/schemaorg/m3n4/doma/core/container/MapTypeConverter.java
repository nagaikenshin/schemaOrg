package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MAP_TYPE;
import org.kyojo.schemaorg.m3n4.core.Container.MapType;

@ExternalDomain
public class MapTypeConverter implements DomainConverter<MapType, String> {

	@Override
	public String fromDomainToValue(MapType domain) {
		return domain.getNativeValue();
	}

	@Override
	public MapType fromValueToDomain(String value) {
		return new MAP_TYPE(value);
	}

}
