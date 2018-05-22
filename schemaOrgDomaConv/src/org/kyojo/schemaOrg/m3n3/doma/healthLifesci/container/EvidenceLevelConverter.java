package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.EVIDENCE_LEVEL;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.EvidenceLevel;

@ExternalDomain
public class EvidenceLevelConverter implements DomainConverter<EvidenceLevel, String> {

	@Override
	public String fromDomainToValue(EvidenceLevel domain) {
		return domain.getNativeValue();
	}

	@Override
	public EvidenceLevel fromValueToDomain(String value) {
		return new EVIDENCE_LEVEL(value);
	}

}
