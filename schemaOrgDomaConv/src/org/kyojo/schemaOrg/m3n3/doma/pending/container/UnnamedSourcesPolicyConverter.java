package org.kyojo.schemaOrg.m3n3.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.pending.impl.UNNAMED_SOURCES_POLICY;
import org.kyojo.schemaOrg.m3n3.pending.Container.UnnamedSourcesPolicy;

@ExternalDomain
public class UnnamedSourcesPolicyConverter implements DomainConverter<UnnamedSourcesPolicy, String> {

	@Override
	public String fromDomainToValue(UnnamedSourcesPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public UnnamedSourcesPolicy fromValueToDomain(String value) {
		return new UNNAMED_SOURCES_POLICY(value);
	}

}
