package org.kyojo.schemaOrg.m3n3.doma.meta.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.meta.impl.SUPERSEDED_BY;
import org.kyojo.schemaOrg.m3n3.meta.Container.SupersededBy;

@ExternalDomain
public class SupersededByConverter implements DomainConverter<SupersededBy, String> {

	@Override
	public String fromDomainToValue(SupersededBy domain) {
		return domain.getNativeValue();
	}

	@Override
	public SupersededBy fromValueToDomain(String value) {
		return new SUPERSEDED_BY(value);
	}

}
