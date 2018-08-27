package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGISLATION_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n4.pending.Container.LegislationLegalValue;

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
