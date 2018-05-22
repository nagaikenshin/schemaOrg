package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CANAL;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Canal;

@ExternalDomain
public class CanalConverter implements DomainConverter<Canal, String> {

	@Override
	public String fromDomainToValue(Canal domain) {
		return domain.getNativeValue();
	}

	@Override
	public Canal fromValueToDomain(String value) {
		return new CANAL(value);
	}

}
