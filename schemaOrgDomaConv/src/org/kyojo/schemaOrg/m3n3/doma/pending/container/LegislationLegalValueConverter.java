package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGISLATION_LEGAL_VALUE;
import org.kyojo.schemaOrg.m3n3.pending.Container.LegislationLegalValue;

@ExternalDomain
public class LegislationLegalValueConverter implements DomainConverter<LegislationLegalValue, String> {

	@Override
	public String fromDomainToValue(LegislationLegalValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegislationLegalValue fromValueToDomain(String value) {
		return new LEGISLATION_LEGAL_VALUE(value);
	}

}
