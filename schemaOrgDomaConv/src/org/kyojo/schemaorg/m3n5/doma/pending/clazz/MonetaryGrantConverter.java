package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.MONETARY_GRANT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.MonetaryGrant;

@ExternalDomain
public class MonetaryGrantConverter implements DomainConverter<MonetaryGrant, String> {

	@Override
	public String fromDomainToValue(MonetaryGrant domain) {
		return domain.getNativeValue();
	}

	@Override
	public MonetaryGrant fromValueToDomain(String value) {
		return new MONETARY_GRANT(value);
	}

}
