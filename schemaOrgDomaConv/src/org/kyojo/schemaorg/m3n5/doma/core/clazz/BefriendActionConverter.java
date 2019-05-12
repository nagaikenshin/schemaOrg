package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BEFRIEND_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.BefriendAction;

@ExternalDomain
public class BefriendActionConverter implements DomainConverter<BefriendAction, String> {

	@Override
	public String fromDomainToValue(BefriendAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public BefriendAction fromValueToDomain(String value) {
		return new BEFRIEND_ACTION(value);
	}

}
