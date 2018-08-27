package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.NERVE;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Nerve;

@ExternalDomain
public class NerveConverter implements DomainConverter<Nerve, String> {

	@Override
	public String fromDomainToValue(Nerve domain) {
		return domain.getNativeValue();
	}

	@Override
	public Nerve fromValueToDomain(String value) {
		return new NERVE(value);
	}

}
