package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.EVIDENCE_ORIGIN;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.EvidenceOrigin;

@ExternalDomain
public class EvidenceOriginConverter implements DomainConverter<EvidenceOrigin, String> {

	@Override
	public String fromDomainToValue(EvidenceOrigin domain) {
		return domain.getNativeValue();
	}

	@Override
	public EvidenceOrigin fromValueToDomain(String value) {
		return new EVIDENCE_ORIGIN(value);
	}

}