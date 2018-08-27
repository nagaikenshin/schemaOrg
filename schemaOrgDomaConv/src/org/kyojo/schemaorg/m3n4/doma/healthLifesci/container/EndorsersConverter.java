package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.ENDORSERS;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Endorsers;

@ExternalDomain
public class EndorsersConverter implements DomainConverter<Endorsers, String> {

	@Override
	public String fromDomainToValue(Endorsers domain) {
		return domain.getNativeValue();
	}

	@Override
	public Endorsers fromValueToDomain(String value) {
		return new ENDORSERS(value);
	}

}
