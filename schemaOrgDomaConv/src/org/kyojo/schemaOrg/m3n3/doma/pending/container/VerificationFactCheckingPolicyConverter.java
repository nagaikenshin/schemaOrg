package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.VERIFICATION_FACT_CHECKING_POLICY;
import org.kyojo.schemaOrg.m3n3.pending.Container.VerificationFactCheckingPolicy;

@ExternalDomain
public class VerificationFactCheckingPolicyConverter implements DomainConverter<VerificationFactCheckingPolicy, String> {

	@Override
	public String fromDomainToValue(VerificationFactCheckingPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public VerificationFactCheckingPolicy fromValueToDomain(String value) {
		return new VERIFICATION_FACT_CHECKING_POLICY(value);
	}

}
