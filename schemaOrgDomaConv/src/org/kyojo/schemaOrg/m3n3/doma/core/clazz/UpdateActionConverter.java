package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.UPDATE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.UpdateAction;

@ExternalDomain
public class UpdateActionConverter implements DomainConverter<UpdateAction, String> {

	@Override
	public String fromDomainToValue(UpdateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public UpdateAction fromValueToDomain(String value) {
		return new UPDATE_ACTION(value);
	}

}
