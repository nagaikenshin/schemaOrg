package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.PHASE;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.Phase;

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
