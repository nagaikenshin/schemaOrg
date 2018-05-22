package org.kyojo.schemaOrg.m3n3.doma.pending.legalValueLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.legalValueLevel.OFFICIAL_LEGAL_VALUE;
import org.kyojo.schemaOrg.m3n3.pending.LegalValueLevel.OfficialLegalValue;

@ExternalDomain
public class OfficialLegalValueConverter implements DomainConverter<OfficialLegalValue, String> {

	@Override
	public String fromDomainToValue(OfficialLegalValue domain) {
		return domain.getNativeValue();
	}

	@Override
	public OfficialLegalValue fromValueToDomain(String value) {
		return new OFFICIAL_LEGAL_VALUE(value);
	}

}
