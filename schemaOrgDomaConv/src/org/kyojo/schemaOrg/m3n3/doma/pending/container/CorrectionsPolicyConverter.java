package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.CORRECTIONS_POLICY;
import org.kyojo.schemaOrg.m3n3.pending.Container.CorrectionsPolicy;

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
