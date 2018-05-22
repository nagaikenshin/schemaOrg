package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.FOLLOWEE;
import org.kyojo.schemaOrg.m3n3.core.Container.Followee;

@ExternalDomain
public class FolloweeConverter implements DomainConverter<Followee, String> {

	@Override
	public String fromDomainToValue(Followee domain) {
		return domain.getNativeValue();
	}

	@Override
	public Followee fromValueToDomain(String value) {
		return new FOLLOWEE(value);
	}

}
