package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.RXCUI;
import org.kyojo.schemaorg.m3n4.pending.Container.Rxcui;

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
