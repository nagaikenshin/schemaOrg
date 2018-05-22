package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.SUBTYPE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Subtype;

@ExternalDomain
public class SubtypeConverter implements DomainConverter<Subtype, String> {

	@Override
	public String fromDomainToValue(Subtype domain) {
		return domain.getNativeValue();
	}

	@Override
	public Subtype fromValueToDomain(String value) {
		return new SUBTYPE(value);
	}

}
