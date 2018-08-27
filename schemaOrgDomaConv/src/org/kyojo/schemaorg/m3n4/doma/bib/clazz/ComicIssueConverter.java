package org.kyojo.schemaorg.m3n4.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.bib.impl.COMIC_ISSUE;
import org.kyojo.schemaorg.m3n4.bib.Clazz.ComicIssue;

@ExternalDomain
public class ComicIssueConverter implements DomainConverter<ComicIssue, String> {

	@Override
	public String fromDomainToValue(ComicIssue domain) {
		return domain.getNativeValue();
	}

	@Override
	public ComicIssue fromValueToDomain(String value) {
		return new COMIC_ISSUE(value);
	}

}
