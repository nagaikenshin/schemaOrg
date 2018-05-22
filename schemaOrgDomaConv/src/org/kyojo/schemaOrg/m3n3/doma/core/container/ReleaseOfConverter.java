package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.RELEASE_OF;
import org.kyojo.schemaOrg.m3n3.core.Container.ReleaseOf;

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
