package org.kyojo.schemaOrg.m3n3.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.LEGAL_VALUE_LEVEL;
import org.kyojo.schemaOrg.m3n3.pending.Clazz.LegalValueLevel;

@ExternalDomain
public class LegalValueLevelConverter implements DomainConverter<LegalValueLevel, String> {

	@Override
	public String fromDomainToValue(LegalValueLevel domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegalValueLevel fromValueToDomain(String value) {
		return new LEGAL_VALUE_LEVEL(value);
	}

}
