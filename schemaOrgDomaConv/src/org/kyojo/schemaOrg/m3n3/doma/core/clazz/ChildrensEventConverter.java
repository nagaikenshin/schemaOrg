package org.kyojo.schemaOrg.m3n3.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.CHILDRENS_EVENT;
import org.kyojo.schemaOrg.m3n3.core.Clazz.ChildrensEvent;

@ExternalDomain
public class ChildrensEventConverter implements DomainConverter<ChildrensEvent, String> {

	@Override
	public String fromDomainToValue(ChildrensEvent domain) {
		return domain.getNativeValue();
	}

	@Override
	public ChildrensEvent fromValueToDomain(String value) {
		return new CHILDRENS_EVENT(value);
	}

}
