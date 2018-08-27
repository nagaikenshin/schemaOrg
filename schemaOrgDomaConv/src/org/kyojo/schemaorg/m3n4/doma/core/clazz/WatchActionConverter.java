package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WATCH_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.WatchAction;

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