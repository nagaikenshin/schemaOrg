package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INTERACTION_SERVICE;
import org.kyojo.schemaorg.m3n5.core.Container.InteractionService;

@ExternalDomain
public class InteractionServiceConverter implements DomainConverter<InteractionService, String> {

	@Override
	public String fromDomainToValue(InteractionService domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractionService fromValueToDomain(String value) {
		return new INTERACTION_SERVICE(value);
	}

}
