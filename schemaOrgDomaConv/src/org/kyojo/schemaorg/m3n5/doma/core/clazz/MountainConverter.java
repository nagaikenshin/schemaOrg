package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MOUNTAIN;
import org.kyojo.schemaorg.m3n5.core.Clazz.Mountain;

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
