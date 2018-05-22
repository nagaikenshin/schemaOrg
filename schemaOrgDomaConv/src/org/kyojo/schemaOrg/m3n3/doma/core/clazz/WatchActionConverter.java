package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WATCH_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WatchAction;

@ExternalDomain
public class WatchActionConverter implements DomainConverter<WatchAction, String> {

	@Override
	public String fromDomainToValue(WatchAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public WatchAction fromValueToDomain(String value) {
		return new WATCH_ACTION(value);
	}

}
