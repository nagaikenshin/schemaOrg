package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MAP_CATEGORY_TYPE;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MapCategoryType;

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
