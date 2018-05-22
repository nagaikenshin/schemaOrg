package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.USER_INTERACTION_COUNT;
import org.kyojo.schemaOrg.m3n3.core.Container.UserInteractionCount;

@ExternalDomain
public class UserInteractionCountConverter implements DomainConverter<UserInteractionCount, Long> {

	@Override
	public Long fromDomainToValue(UserInteractionCount domain) {
		return domain.getNativeValue();
	}

	@Override
	public UserInteractionCount fromValueToDomain(Long value) {
		return new USER_INTERACTION_COUNT(value);
	}

}
