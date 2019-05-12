package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.LEGAL_FORCE_STATUS;
import org.kyojo.schemaorg.m3n5.pending.Clazz.LegalForceStatus;

@ExternalDomain
public class LegalForceStatusConverter implements DomainConverter<LegalForceStatus, String> {

	@Override
	public String fromDomainToValue(LegalForceStatus domain) {
		return domain.getNativeValue();
	}

	@Override
	public LegalForceStatus fromValueToDomain(String value) {
		return new LEGAL_FORCE_STATUS(value);
	}

}
