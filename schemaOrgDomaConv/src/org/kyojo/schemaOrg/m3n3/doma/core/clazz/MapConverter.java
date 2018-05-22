package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MAP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Map;

@ExternalDomain
public class MapConverter implements DomainConverter<Map, String> {

	@Override
	public String fromDomainToValue(Map domain) {
		return domain.getNativeValue();
	}

	@Override
	public Map fromValueToDomain(String value) {
		return new MAP(value);
	}

}
