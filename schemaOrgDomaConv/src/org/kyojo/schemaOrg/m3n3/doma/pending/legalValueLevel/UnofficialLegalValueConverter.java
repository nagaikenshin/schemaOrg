package org.kyojo.schemaOrg.m3n3.doma.pending.legalValueLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.legalValueLevel.UNOFFICIAL_LEGAL_VALUE;
import org.kyojo.schemaOrg.m3n3.pending.LegalValueLevel.UnofficialLegalValue;

@ExternalDomain
public class UnofficialLegalValueConverter implements DomainConverter<UnofficialLegalValue, String> {

	@Override
	public String fromDomainToValue(UnofficialLegalValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnofficialLegalValue fromValueToDomain(String value) {
		return new UNOFFICIAL_LEGAL_VALUE(value);
	}

}
