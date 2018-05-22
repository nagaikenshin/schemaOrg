package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PHASE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Phase;

@ExternalDomain
public class PhaseConverter implements DomainConverter<Phase, String> {

	@Override
	public String fromDomainToValue(Phase domain) {
		return domain.getNativeValue();
	}

	@Override
	public Phase fromValueToDomain(String value) {
		return new PHASE(value);
	}

}
