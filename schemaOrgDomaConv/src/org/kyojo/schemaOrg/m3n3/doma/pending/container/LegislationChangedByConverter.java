package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_CHANGED_BY;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationChangedBy;

@ExternalDomain
public class LegislationChangedByConverter implements DomainConverter<LegislationChangedBy, String> {

	@Override
	public String fromDomainToValue(LegislationChangedBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationChangedBy fromValueToDomain(String value) {
		return new LEGISLATION_CHANGED_BY(value);
	}

}
