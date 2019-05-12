package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SAME_AS;
import org.kyojo.schemaorg.m3n5.core.Container.SameAs;

@ExternalDomain
public class SameAsConverter implements DomainConverter<SameAs, String> {

	@Override
	public String fromDomainToValue(SameAs domain) {
		return domain.getNativeValue();
	}

	@Override
	public SameAs fromValueToDomain(String value) {
		return new SAME_AS(value);
	}

}
