package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CANAL;
import org.kyojo.schemaorg.m3n5.core.Clazz.Canal;

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
