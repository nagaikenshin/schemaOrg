package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.MPN;
import org.kyojo.schemaorg.m3n5.core.Container.Mpn;

@ExternalDomain
public class MpnConverter implements DomainConverter<Mpn, String> {

	@Override
	public String fromDomainToValue(Mpn domain) {
		return domain.getNativeValue();
	}

	@Override
	public Mpn fromValueToDomain(String value) {
		return new MPN(value);
	}

}
