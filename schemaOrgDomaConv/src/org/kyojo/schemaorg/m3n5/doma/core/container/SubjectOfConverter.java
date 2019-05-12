package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.SUBJECT_OF;
import org.kyojo.schemaorg.m3n5.core.Container.SubjectOf;

@ExternalDomain
public class SubjectOfConverter implements DomainConverter<SubjectOf, String> {

	@Override
	public String fromDomainToValue(SubjectOf domain) {
		return domain.getNativeValue();
	}

	@Override
	public SubjectOf fromValueToDomain(String value) {
		return new SUBJECT_OF(value);
	}

}
