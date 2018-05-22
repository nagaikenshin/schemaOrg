package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CREATE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.CreateAction;

@ExternalDomain
public class CreateActionConverter implements DomainConverter<CreateAction, String> {

	@Override
	public String fromDomainToValue(CreateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public CreateAction fromValueToDomain(String value) {
		return new CREATE_ACTION(value);
	}

}
