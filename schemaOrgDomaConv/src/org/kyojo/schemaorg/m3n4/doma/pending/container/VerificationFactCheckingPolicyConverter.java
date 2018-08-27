package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.VERIFICATION_FACT_CHECKING_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.VerificationFactCheckingPolicy;

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
