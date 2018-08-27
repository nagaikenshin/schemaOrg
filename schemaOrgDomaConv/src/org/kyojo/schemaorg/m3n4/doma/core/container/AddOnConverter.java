package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ADD_ON;
import org.kyojo.schemaorg.m3n4.core.Container.AddOn;

@ExternalDomain
public class AddOnConverter implements DomainConverter<AddOn, String> {

	@Override
	public String fromDomainToValue(AddOn domain) {
		return domain.getNativeValue();
	}

	@Override
	public AddOn fromValueToDomain(String value) {
		return new ADD_ON(value);
	}

}
