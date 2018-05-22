package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_TRANSPOSED_BY;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationTransposedBy;

@ExternalDomain
public class LegislationTransposedByConverter implements DomainConverter<LegislationTransposedBy, String> {

	@Override
	public String fromDomainToValue(LegislationTransposedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationTransposedBy fromValueToDomain(String value) {
		return new LEGISLATION_TRANSPOSED_BY(value);
	}

}
