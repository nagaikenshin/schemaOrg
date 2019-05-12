package org.kyojo.schemaorg.m3n5.doma.meta.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.meta.impl.INVERSE_OF;
import org.kyojo.schemaorg.m3n5.meta.Container.InverseOf;

@ExternalDomain
public class InverseOfConverter implements DomainConverter<InverseOf, String> {

	@Override
	public String fromDomainToValue(InverseOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public InverseOf fromValueToDomain(String value) {
		return new INVERSE_OF(value);
	}

}