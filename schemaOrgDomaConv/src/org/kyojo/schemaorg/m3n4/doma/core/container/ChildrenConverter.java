package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHILDREN;
import org.kyojo.schemaorg.m3n4.core.Container.Children;

@ExternalDomain
public class ChildrenConverter implements DomainConverter<Children, String> {

	@Override
	public String fromDomainToValue(Children domain) {
		return domain.getNativeValue();
	}

	@Override
	public Children fromValueToDomain(String value) {
		return new CHILDREN(value);
	}

}
