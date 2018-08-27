package org.kyojo.schemaorg.m3n4.doma.pending.legalValueLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.legalValueLevel.DEFINITIVE_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n4.pending.LegalValueLevel.DefinitiveLegalValue;

@ExternalDomain
public class DefinitiveLegalValueConverter implements DomainConverter<DefinitiveLegalValue, String> {

	@Override
	public String fromDomainToValue(DefinitiveLegalValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public DefinitiveLegalValue fromValueToDomain(String value) {
		return new DEFINITIVE_LEGAL_VALUE(value);
	}

}
