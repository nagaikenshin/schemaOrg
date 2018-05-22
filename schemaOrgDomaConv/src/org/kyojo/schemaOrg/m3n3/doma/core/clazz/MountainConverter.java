package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOUNTAIN;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Mountain;

@ExternalDomain
public class MountainConverter implements DomainConverter<Mountain, String> {

	@Override
	public String fromDomainToValue(Mountain domain) {
		return domain.getNativeValue();
	}

	@Override
	public Mountain fromValueToDomain(String value) {
		return new MOUNTAIN(value);
	}

}
