package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EVIDENCE_LEVEL;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.EvidenceLevel;

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
