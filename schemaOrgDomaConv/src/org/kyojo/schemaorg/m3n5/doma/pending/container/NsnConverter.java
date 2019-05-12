package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.NSN;
import org.kyojo.schemaorg.m3n5.pending.Container.Nsn;

@ExternalDomain
public class NsnConverter implements DomainConverter<Nsn, String> {

	@Override
	public String fromDomainToValue(Nsn domain) {
		return domain.getNativeValue();
	}

	@Override
	public Nsn fromValueToDomain(String value) {
		return new NSN(value);
	}

}
