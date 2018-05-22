package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.CHAPTER;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.Chapter;

@ExternalDomain
public class ChapterConverter implements DomainConverter<Chapter, String> {

	@Override
	public String fromDomainToValue(Chapter domain) {
		return domain.getNativeValue();
	}

	@Override
	public Chapter fromValueToDomain(String value) {
		return new CHAPTER(value);
	}

}
