package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LEND_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.LendAction;

@ExternalDomain
public class LendActionConverter implements DomainConverter<LendAction, String> {

	@Override
	public String fromDomainToValue(LendAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public LendAction fromValueToDomain(String value) {
		return new LEND_ACTION(value);
	}

}
