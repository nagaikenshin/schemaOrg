package org.kyojo.schemaorg.m3n4.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.pending.impl.ETHICS_POLICY;
import org.kyojo.schemaorg.m3n4.pending.Container.EthicsPolicy;

@ExternalDomain
public class EthicsPolicyConverter implements DomainConverter<EthicsPolicy, String> {

	@Override
	public String fromDomainToValue(EthicsPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public EthicsPolicy fromValueToDomain(String value) {
		return new ETHICS_POLICY(value);
	}

}
