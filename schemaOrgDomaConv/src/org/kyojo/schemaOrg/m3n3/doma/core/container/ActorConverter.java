package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ACTOR;
import org.kyojo.schemaOrg.m3n3.core.Container.Actor;

@ExternalDomain
public class ActorConverter implements DomainConverter<Actor, String> {

	@Override
	public String fromDomainToValue(Actor domain) {
		return domain.getNativeValue();
	}

	@Override
	public Actor fromValueToDomain(String value) {
		return new ACTOR(value);
	}

}
