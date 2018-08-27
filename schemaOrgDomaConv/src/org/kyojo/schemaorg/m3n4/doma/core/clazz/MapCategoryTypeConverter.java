package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.MAP_CATEGORY_TYPE;
import org.kyojo.schemaorg.m3n4.core.Clazz.MapCategoryType;

@ExternalDomain
public class MapCategoryTypeConverter implements DomainConverter<MapCategoryType, String> {

	@Override
	public String fromDomainToValue(MapCategoryType domain) {
		return domain.getNativeValue();
	}

	@Override
	public MapCategoryType fromValueToDomain(String value) {
		return new MAP_CATEGORY_TYPE(value);
	}

}