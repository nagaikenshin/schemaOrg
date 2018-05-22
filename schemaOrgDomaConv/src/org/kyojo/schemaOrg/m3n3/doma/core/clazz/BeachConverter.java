package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.BEACH;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Beach;

@ExternalDomain
public class BeachConverter implements DomainConverter<Beach, String> {

	@Override
	public String fromDomainToValue(Beach domain) {
		return domain.getNativeValue();
	}

	@Override
	public Beach fromValueToDomain(String value) {
		return new BEACH(value);
	}

}
