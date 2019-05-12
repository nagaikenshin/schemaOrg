package org.kyojo.schemaorg.m3n5.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.NEWSPAPER;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Newspaper;

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
