package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WINERY;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Winery;

@ExternalDomain
public class WineryConverter implements DomainConverter<Winery, String> {

	@Override
	public String fromDomainToValue(Winery domain) {
		return domain.getNativeValue();
	}

	@Override
	public Winery fromValueToDomain(String value) {
		return new WINERY(value);
	}

}
