package org.kyojo.schemaorg.m3n5.doma.pending.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.NO_BYLINES_POLICY;
import org.kyojo.schemaorg.m3n5.pending.Container.NoBylinesPolicy;

@ExternalDomain
public class NoBylinesPolicyConverter implements DomainConverter<NoBylinesPolicy, String> {

	@Override
	public String fromDomainToValue(NoBylinesPolicy domain) {
		return domain.getNativeValue();
	}

	@Override
	public NoBylinesPolicy fromValueToDomain(String value) {
		return new NO_BYLINES_POLICY(value);
	}

}
