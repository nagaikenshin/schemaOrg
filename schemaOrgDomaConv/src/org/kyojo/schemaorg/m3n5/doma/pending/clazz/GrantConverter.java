package org.kyojo.schemaorg.m3n5.doma.pending.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.pending.impl.GRANT;
import org.kyojo.schemaorg.m3n5.pending.Clazz.Grant;

@ExternalDomain
public class GrantConverter implements DomainConverter<Grant, String> {

	@Override
	public String fromDomainToValue(Grant domain) {
		return domain.getNativeValue();
	}

	@Override
	public Grant fromValueToDomain(String value) {
		return new GRANT(value);
	}

}
