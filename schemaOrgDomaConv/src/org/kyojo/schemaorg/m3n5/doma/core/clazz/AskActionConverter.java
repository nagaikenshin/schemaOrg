package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ASK_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AskAction;

@ExternalDomain
public class AskActionConverter implements DomainConverter<AskAction, String> {

	@Override
	public String fromDomainToValue(AskAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AskAction fromValueToDomain(String value) {
		return new ASK_ACTION(value);
	}

}
