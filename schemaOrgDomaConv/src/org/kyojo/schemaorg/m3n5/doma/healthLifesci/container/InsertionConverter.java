package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.INSERTION;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Insertion;

@ExternalDomain
public class InsertionConverter implements DomainConverter<Insertion, String> {

	@Override
	public String fromDomainToValue(Insertion domain) {
		return domain.getNativeValue();
	}

	@Override
	public Insertion fromValueToDomain(String value) {
		return new INSERTION(value);
	}

}
