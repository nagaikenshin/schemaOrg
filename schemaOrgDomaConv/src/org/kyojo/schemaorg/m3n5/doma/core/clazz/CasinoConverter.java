package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.CASINO;
import org.kyojo.schemaorg.m3n5.core.Clazz.Casino;

@ExternalDomain
public class CasinoConverter implements DomainConverter<Casino, String> {

	@Override
	public String fromDomainToValue(Casino domain) {
		return domain.getNativeValue();
	}

	@Override
	public Casino fromValueToDomain(String value) {
		return new CASINO(value);
	}

}
