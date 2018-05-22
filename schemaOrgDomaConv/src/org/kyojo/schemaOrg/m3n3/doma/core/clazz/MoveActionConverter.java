package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.MOVE_ACTION;
import org.kyojo.schemaOrg.m3n3.core.Clazz.MoveAction;

@ExternalDomain
public class MoveActionConverter implements DomainConverter<MoveAction, String> {

	@Override
	public String fromDomainToValue(MoveAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public MoveAction fromValueToDomain(String value) {
		return new MOVE_ACTION(value);
	}

}
