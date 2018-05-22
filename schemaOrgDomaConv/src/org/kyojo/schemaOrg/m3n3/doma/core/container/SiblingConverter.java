package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.SIBLING;
import org.kyojo.schemaOrg.m3n3.core.Container.Sibling;

@ExternalDomain
public class SiblingConverter implements DomainConverter<Sibling, String> {

	@Override
	public String fromDomainToValue(Sibling domain) {
		return domain.getNativeValue();
	}

	@Override
	public Sibling fromValueToDomain(String value) {
		return new SIBLING(value);
	}

}
