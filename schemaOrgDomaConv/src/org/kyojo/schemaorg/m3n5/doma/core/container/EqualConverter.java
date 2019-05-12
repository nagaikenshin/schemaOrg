package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.EQUAL;
import org.kyojo.schemaorg.m3n5.core.Container.Equal;

@ExternalDomain
public class EqualConverter implements DomainConverter<Equal, String> {

	@Override
	public String fromDomainToValue(Equal domain) {
		return domain.getNativeValue();
	}

	@Override
	public Equal fromValueToDomain(String value) {
		return new EQUAL(value);
	}

}
