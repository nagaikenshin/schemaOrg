package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHILDREN;
import org.kyojo.schemaOrg.m3n3.core.Container.Children;

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
