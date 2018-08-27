package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CONSUME_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.ConsumeAction;

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
