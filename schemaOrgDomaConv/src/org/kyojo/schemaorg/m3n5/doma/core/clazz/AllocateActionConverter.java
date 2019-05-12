package org.kyojo.schemaorg.m3n5.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.ALLOCATE_ACTION;
import org.kyojo.schemaorg.m3n5.core.Clazz.AllocateAction;

@ExternalDomain
public class AllocateActionConverter implements DomainConverter<AllocateAction, String> {

	@Override
	public String fromDomainToValue(AllocateAction domain) {
		return domain.getNativeValue();
	}

	@Override
	public AllocateAction fromValueToDomain(String value) {
		return new ALLOCATE_ACTION(value);
	}

}