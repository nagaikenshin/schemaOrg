package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LIKE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LikeAction;

@ExternalDomain
public class LikeActionConverter implements DomainConverter<LikeAction, String> {

	@Override
	public String fromDomainToValue(LikeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public LikeAction fromValueToDomain(String value) {
		return new LIKE_ACTION(value);
	}

}
