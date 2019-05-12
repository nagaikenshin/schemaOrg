package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.INTERACT_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.InteractAction;

@ExternalDomain
public class InteractActionConverter implements DomainConverter<InteractAction, String> {

	@Override
	public String fromDomainToValue(InteractAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public InteractAction fromValueToDomain(String value) {
		return new INTERACT_ACTION(value);
	}

}
