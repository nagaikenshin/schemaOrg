package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.DELETE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.DeleteAction;

@ExternalDomain
public class DeleteActionConverter implements DomainConverter<DeleteAction, String> {

	@Override
	public String fromDomainToValue(DeleteAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public DeleteAction fromValueToDomain(String value) {
		return new DELETE_ACTION(value);
	}

}
