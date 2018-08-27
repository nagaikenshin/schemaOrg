package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_CHANGES;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationChanges;

@ExternalDomain
public class LegislationChangesConverter implements DomainConverter<LegislationChanges, String> {

	@Override
	public String fromDomainToValue(LegislationChanges domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationChanges fromValueToDomain(String value) {
		return new LEGISLATION_CHANGES(value);
	}

}