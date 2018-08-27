package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.DELETE_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.DeleteAction;

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
