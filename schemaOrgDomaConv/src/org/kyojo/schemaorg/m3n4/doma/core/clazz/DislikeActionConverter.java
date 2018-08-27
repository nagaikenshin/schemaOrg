package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DISLIKE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DislikeAction;

@ExternalDomain
public class DislikeActionConverter implements DomainConverter<DislikeAction, String> {

	@Override
	public String fromDomainToValue(DislikeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DislikeAction fromValueToDomain(String value) {
		return new DISLIKE_ACTION(value);
	}

}
