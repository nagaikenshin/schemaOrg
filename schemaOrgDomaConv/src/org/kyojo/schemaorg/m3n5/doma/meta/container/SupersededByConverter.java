package org.kyojo.schemaorg.m3n5.doma.meta.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.meta.impl.SUPERSEDED_BY;
import org.kyojo.schemaorg.m3n5.meta.Container.SupersededBy;

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
