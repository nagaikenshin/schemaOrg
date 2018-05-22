package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.THESIS;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.Thesis;

@ExternalDomain
public class ThesisConverter implements DomainConverter<Thesis, String> {

	@Override
	public String fromDomainToValue(Thesis domain) {
		return domain.getNativeValue();
	}

	@Override
	public Thesis fromValueToDomain(String value) {
		return new THESIS(value);
	}

}
