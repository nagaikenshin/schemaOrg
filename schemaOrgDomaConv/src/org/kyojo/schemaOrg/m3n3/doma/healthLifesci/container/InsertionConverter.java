package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.INSERTION;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Insertion;

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
