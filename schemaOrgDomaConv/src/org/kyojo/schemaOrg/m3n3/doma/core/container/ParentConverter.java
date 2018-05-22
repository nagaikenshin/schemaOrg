package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.PARENT;
import org.kyojo.schemaOrg.m3n3.core.Container.Parent;

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
