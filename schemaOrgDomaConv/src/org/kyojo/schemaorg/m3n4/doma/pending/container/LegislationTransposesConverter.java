package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_TRANSPOSES;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationTransposes;

@ExternalDomain
public class LegislationTransposesConverter implements DomainConverter<LegislationTransposes, String> {

	@Override
	public String fromDomainToValue(LegislationTransposes domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationTransposes fromValueToDomain(String value) {
		return new LEGISLATION_TRANSPOSES(value);
	}

}
