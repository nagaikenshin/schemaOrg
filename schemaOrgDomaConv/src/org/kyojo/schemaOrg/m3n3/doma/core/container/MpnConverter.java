package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MPN;
import org.kyojo.schemaOrg.m3n3.core.Container.Mpn;

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
