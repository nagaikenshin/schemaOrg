package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.PARENT;
import org.kyojo.schemaorg.m3n5.core.Container.Parent;

@ExternalDomain
public class ParentConverter implements DomainConverter<Parent, String> {

	@Override
	public String fromDomainToValue(Parent domain) {
		return domain.getNativeValue();
	}

	@Override
	public Parent fromValueToDomain(String value) {
		return new PARENT(value);
	}

}
