package org.kyojo.schemaorg.m3n4.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.LEGAL_VALUE_LEVEL;
import org.kyojo.schemaorg.m3n4.pending.Clazz.LegalValueLevel;

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
