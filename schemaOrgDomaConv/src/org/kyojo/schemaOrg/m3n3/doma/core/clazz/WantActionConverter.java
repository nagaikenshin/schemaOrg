package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.WANT_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.WantAction;

@ExternalDomain
public class WantActionConverter implements DomainConverter<WantAction, String> {

	@Override
	public String fromDomainToValue(WantAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public WantAction fromValueToDomain(String value) {
		return new WANT_ACTION(value);
	}

}
