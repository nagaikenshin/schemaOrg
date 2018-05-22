package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DANCE_GROUP;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DanceGroup;

@ExternalDomain
public class DanceGroupConverter implements DomainConverter<DanceGroup, String> {

	@Override
	public String fromDomainToValue(DanceGroup domain) {
		return domain.getNativeValue();
	}

	@Override
	public DanceGroup fromValueToDomain(String value) {
		return new DANCE_GROUP(value);
	}

}
