package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_CHANGES;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationChanges;

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
