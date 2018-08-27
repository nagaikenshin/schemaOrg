package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.RELEASE_OF;
import org.kyojo.schemaorg.m3n4.core.Container.ReleaseOf;

@ExternalDomain
public class ReleaseOfConverter implements DomainConverter<ReleaseOf, String> {

	@Override
	public String fromDomainToValue(ReleaseOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReleaseOf fromValueToDomain(String value) {
		return new RELEASE_OF(value);
	}

}
