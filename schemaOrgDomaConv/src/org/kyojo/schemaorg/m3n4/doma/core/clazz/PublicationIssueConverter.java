package org.kyojo.schemaorg.m3n4.doma.core.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.PUBLICATION_ISSUE;
import org.kyojo.schemaorg.m3n4.core.Clazz.PublicationIssue;

@ExternalDomain
public class PublicationIssueConverter implements DomainConverter<PublicationIssue, String> {

	@Override
	public String fromDomainToValue(PublicationIssue domain) {
		return domain.getNativeValue();
	}

	@Override
	public PublicationIssue fromValueToDomain(String value) {
		return new PUBLICATION_ISSUE(value);
	}

}
