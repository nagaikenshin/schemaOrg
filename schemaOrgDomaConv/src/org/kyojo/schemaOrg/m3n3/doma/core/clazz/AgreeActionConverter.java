package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.AGREE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AgreeAction;

@ExternalDomain
public class AgreeActionConverter implements DomainConverter<AgreeAction, String> {

	@Override
	public String fromDomainToValue(AgreeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AgreeAction fromValueToDomain(String value) {
		return new AGREE_ACTION(value);
	}

}
