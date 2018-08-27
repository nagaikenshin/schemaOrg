package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ASSIGN_ACTION;
import org.kyojo.schemaorg.m3n4.core.Clazz.AssignAction;

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
