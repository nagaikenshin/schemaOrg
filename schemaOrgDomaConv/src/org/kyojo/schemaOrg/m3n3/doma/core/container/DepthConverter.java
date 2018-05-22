package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DEPTH;
import org.kyojo.schemaOrg.m3n3.core.Container.Depth;

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
