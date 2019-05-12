package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.CORRECTIONS_POLICY;
import org.kyojo.schemaorg.m3n5.pending.Container.CorrectionsPolicy;

@ExternalDomain
public class CorrectionsPolicyConverter implements DomainConverter<CorrectionsPolicy, String> {

	@Override
	public String fromDomainToValue(CorrectionsPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public CorrectionsPolicy fromValueToDomain(String value) {
		return new CORRECTIONS_POLICY(value);
	}

}
