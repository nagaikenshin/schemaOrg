package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.COMIC_ISSUE;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.ComicIssue;

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
