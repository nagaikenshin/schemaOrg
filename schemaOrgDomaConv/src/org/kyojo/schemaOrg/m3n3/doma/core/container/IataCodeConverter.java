package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.IATA_CODE;
import org.kyojo.schemaOrg.m3n3.core.Container.IataCode;

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
