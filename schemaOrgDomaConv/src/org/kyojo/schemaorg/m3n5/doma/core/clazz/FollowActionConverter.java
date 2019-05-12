package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.FOLLOW_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.FollowAction;

@ExternalDomain
public class FollowActionConverter implements DomainConverter<FollowAction, String> {

	@Override
	public String fromDomainToValue(FollowAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public FollowAction fromValueToDomain(String value) {
		return new FOLLOW_ACTION(value);
	}

}
