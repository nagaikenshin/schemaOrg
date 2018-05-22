package org.kyojo.schemaOrg.m3n3.doma.pending.legalValueLevel;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.legalValueLevel.DEFINITIVE;
import org.kyojo.schemaOrg.m3n3.pending.LegalValueLevel.Definitive;

@ExternalDomain
public class DefinitiveConverter implements DomainConverter<Definitive, String> {

	@Override
	public String fromDomainToValue(Definitive domain) {
		return domain.getNativeValue();
	}

	@Override
	public Definitive fromValueToDomain(String value) {
		return new DEFINITIVE(value);
	}

}
