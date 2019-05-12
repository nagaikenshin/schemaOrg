package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.WINERY;
import org.kyojo.schemaorg.m3n5.core.Clazz.Winery;

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
