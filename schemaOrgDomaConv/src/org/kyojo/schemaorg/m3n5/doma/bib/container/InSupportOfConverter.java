package org.kyojo.schemaorg.m3n5.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.IN_SUPPORT_OF;
import org.kyojo.schemaorg.m3n5.bib.Container.InSupportOf;

@ExternalDomain
public class InSupportOfConverter implements DomainConverter<InSupportOf, String> {

	@Override
	public String fromDomainToValue(InSupportOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public InSupportOf fromValueToDomain(String value) {
		return new IN_SUPPORT_OF(value);
	}

}
