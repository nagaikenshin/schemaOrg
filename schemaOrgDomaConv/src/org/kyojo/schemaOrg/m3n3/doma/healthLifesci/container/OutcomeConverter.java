package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.OUTCOME;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Outcome;

@ExternalDomain
public class OutcomeConverter implements DomainConverter<Outcome, String> {

	@Override
	public String fromDomainToValue(Outcome domain) {
		return domain.getNativeValue();
	}

	@Override
	public Outcome fromValueToDomain(String value) {
		return new OUTCOME(value);
	}

}
