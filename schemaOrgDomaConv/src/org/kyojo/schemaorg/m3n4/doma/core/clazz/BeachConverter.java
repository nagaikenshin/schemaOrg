package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.BEACH;
import org.kyojo.schemaorg.m3n4.core.Clazz.Beach;

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
