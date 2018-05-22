package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOLLOWS;
import org.kyojo.schemaOrg.m3n3.core.Container.Follows;

@ExternalDomain
public class FollowsConverter implements DomainConverter<Follows, String> {

	@Override
	public String fromDomainToValue(Follows domain) {
		return domain.getNativeValue();
	}

	@Override
	public Follows fromValueToDomain(String value) {
		return new FOLLOWS(value);
	}

}
