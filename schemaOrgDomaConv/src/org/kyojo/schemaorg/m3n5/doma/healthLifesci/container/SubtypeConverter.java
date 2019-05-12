package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.SUBTYPE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Subtype;

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
