package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.NEWSPAPER;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.Newspaper;

@ExternalDomain
public class NewspaperConverter implements DomainConverter<Newspaper, String> {

	@Override
	public String fromDomainToValue(Newspaper domain) {
		return domain.getNativeValue();
	}

	@Override
	public Newspaper fromValueToDomain(String value) {
		return new NEWSPAPER(value);
	}

}
