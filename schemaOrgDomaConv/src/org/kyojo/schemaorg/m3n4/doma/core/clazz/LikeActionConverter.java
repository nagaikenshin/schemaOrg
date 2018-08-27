package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LIKE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.LikeAction;

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
