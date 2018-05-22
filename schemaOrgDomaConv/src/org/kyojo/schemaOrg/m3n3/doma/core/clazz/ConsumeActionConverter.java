package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CONSUME_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ConsumeAction;

@ExternalDomain
public class ConsumeActionConverter implements DomainConverter<ConsumeAction, String> {

	@Override
	public String fromDomainToValue(ConsumeAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ConsumeAction fromValueToDomain(String value) {
		return new CONSUME_ACTION(value);
	}

}
