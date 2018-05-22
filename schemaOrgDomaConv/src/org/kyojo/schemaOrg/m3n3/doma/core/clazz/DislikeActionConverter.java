package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DISLIKE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DislikeAction;

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
