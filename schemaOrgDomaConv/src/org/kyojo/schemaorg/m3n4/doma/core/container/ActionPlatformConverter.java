package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ACTION_PLATFORM;
import org.kyojo.schemaorg.m3n4.core.Container.ActionPlatform;

@ExternalDomain
public class ActionPlatformConverter implements DomainConverter<ActionPlatform, String> {

	@Override
	public String fromDomainToValue(ActionPlatform domain) {
		return domain.getNativeValue();
	}

	@Override
	public ActionPlatform fromValueToDomain(String value) {
		return new ACTION_PLATFORM(value);
	}

}
