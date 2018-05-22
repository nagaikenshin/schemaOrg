package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ICAO_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.IcaoCode;

@ExternalDomain
public class IcaoCodeConverter implements DomainConverter<IcaoCode, String> {

	@Override
	public String fromDomainToValue(IcaoCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public IcaoCode fromValueToDomain(String value) {
		return new ICAO_CODE(value);
	}

}
