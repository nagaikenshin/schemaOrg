package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.INKER;
import org.kyojo.schemaOrg.m3n3.bib.Container.Inker;

@ExternalDomain
public class InkerConverter implements DomainConverter<Inker, String> {

	@Override
	public String fromDomainToValue(Inker domain) {
		return domain.getNativeValue();
	}

	@Override
	public Inker fromValueToDomain(String value) {
		return new INKER(value);
	}

}
