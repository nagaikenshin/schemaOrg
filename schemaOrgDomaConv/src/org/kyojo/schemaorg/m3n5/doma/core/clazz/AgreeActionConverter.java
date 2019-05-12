package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.AGREE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AgreeAction;

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
