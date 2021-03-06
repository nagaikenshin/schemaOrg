package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.IATA_CODE;
import org.kyojo.schemaorg.m3n5.core.Container.IataCode;

@ExternalDomain
public class IataCodeConverter implements DomainConverter<IataCode, String> {

	@Override
	public String fromDomainToValue(IataCode domain) {
		return domain.getNativeValue();
	}

	@Override
	public IataCode fromValueToDomain(String value) {
		return new IATA_CODE(value);
	}

}
