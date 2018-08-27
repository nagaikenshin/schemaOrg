package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DEPTH;
import org.kyojo.schemaorg.m3n4.core.Container.Depth;

@ExternalDomain
public class DepthConverter implements DomainConverter<Depth, String> {

	@Override
	public String fromDomainToValue(Depth domain) {
		return domain.getNativeValue();
	}

	@Override
	public Depth fromValueToDomain(String value) {
		return new DEPTH(value);
	}

}
