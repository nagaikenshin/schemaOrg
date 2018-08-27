package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.CHILDRENS_EVENT;
import org.kyojo.schemaorg.m3n4.core.Clazz.ChildrensEvent;

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
