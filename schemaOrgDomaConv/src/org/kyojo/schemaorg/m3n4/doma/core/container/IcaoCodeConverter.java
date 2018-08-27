package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ICAO_CODE;
import org.kyojo.schemaorg.m3n4.core.Container.IcaoCode;

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
