package org.kyojo.schemaorg.m3n4.doma.pending.legalValueLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.legalValueLevel.AUTHORITATIVE_LEGAL_VALUE;
import org.kyojo.schemaorg.m3n4.pending.LegalValueLevel.AuthoritativeLegalValue;

@ExternalDomain
public class AuthoritativeLegalValueConverter implements DomainConverter<AuthoritativeLegalValue, String> {

	@Override
	public String fromDomainToValue(AuthoritativeLegalValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public AuthoritativeLegalValue fromValueToDomain(String value) {
		return new AUTHORITATIVE_LEGAL_VALUE(value);
	}

}
