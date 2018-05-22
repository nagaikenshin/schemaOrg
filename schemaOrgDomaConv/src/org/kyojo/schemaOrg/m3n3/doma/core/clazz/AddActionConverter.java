package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ADD_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AddAction;

@ExternalDomain
public class AddActionConverter implements DomainConverter<AddAction, String> {

	@Override
	public String fromDomainToValue(AddAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AddAction fromValueToDomain(String value) {
		return new ADD_ACTION(value);
	}

}
