package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.REPLACE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ReplaceAction;

@ExternalDomain
public class ReplaceActionConverter implements DomainConverter<ReplaceAction, String> {

	@Override
	public String fromDomainToValue(ReplaceAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ReplaceAction fromValueToDomain(String value) {
		return new REPLACE_ACTION(value);
	}

}
