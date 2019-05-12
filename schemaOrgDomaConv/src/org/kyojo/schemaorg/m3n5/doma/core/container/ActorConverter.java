package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ACTOR;
import org.kyojo.schemaorg.m3n5.core.Container.Actor;

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
