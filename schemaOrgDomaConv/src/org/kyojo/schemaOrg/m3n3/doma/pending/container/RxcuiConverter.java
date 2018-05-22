package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.RXCUI;
import org.kyojo.schemaOrg.m3n3.pending.Container.Rxcui;

@ExternalDomain
public class RxcuiConverter implements DomainConverter<Rxcui, String> {

	@Override
	public String fromDomainToValue(Rxcui domain) {
		return domain.getNativeValue();
	}

	@Override
	public Rxcui fromValueToDomain(String value) {
		return new RXCUI(value);
	}

}
