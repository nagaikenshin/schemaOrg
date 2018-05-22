package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CASINO;
import org.kyojo.schemaOrg.m3n3.core.Clazz.Casino;

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
