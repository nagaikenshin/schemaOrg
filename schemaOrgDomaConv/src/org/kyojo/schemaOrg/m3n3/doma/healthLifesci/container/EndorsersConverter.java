package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.ENDORSERS;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Endorsers;

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
