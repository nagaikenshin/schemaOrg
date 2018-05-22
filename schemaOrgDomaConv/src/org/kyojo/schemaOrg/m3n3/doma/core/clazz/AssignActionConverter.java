package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.ASSIGN_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.AssignAction;

@ExternalDomain
public class AssignActionConverter implements DomainConverter<AssignAction, String> {

	@Override
	public String fromDomainToValue(AssignAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AssignAction fromValueToDomain(String value) {
		return new ASSIGN_ACTION(value);
	}

}
