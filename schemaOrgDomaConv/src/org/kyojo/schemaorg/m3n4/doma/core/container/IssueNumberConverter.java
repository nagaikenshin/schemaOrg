package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.ISSUE_NUMBER;
import org.kyojo.schemaorg.m3n4.core.Container.IssueNumber;

@ExternalDomain
public class IssueNumberConverter implements DomainConverter<IssueNumber, String> {

	@Override
	public String fromDomainToValue(IssueNumber domain) {
		return domain.getNativeValue();
	}

	@Override
	public IssueNumber fromValueToDomain(String value) {
		return new ISSUE_NUMBER(value);
	}

}
