package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FIBER_CONTENT;
import org.kyojo.schemaorg.m3n5.core.Container.FiberContent;

@ExternalDomain
public class FiberContentConverter implements DomainConverter<FiberContent, String> {

	@Override
	public String fromDomainToValue(FiberContent domain) {
		return domain.getNativeValue();
	}

	@Override
	public FiberContent fromValueToDomain(String value) {
		return new FIBER_CONTENT(value);
	}

}
