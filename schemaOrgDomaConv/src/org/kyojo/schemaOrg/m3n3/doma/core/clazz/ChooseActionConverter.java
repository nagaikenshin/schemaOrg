package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHOOSE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ChooseAction;

@ExternalDomain
public class ChooseActionConverter implements DomainConverter<ChooseAction, String> {

	@Override
	public String fromDomainToValue(ChooseAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public ChooseAction fromValueToDomain(String value) {
		return new CHOOSE_ACTION(value);
	}

}
