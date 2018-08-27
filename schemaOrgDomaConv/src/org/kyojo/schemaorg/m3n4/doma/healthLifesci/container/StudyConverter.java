package org.kyojo.schemaorg.m3n4.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.healthLifesci.impl.STUDY;
import org.kyojo.schemaorg.m3n4.healthLifesci.Container.Study;

@ExternalDomain
public class StudyConverter implements DomainConverter<Study, String> {

	@Override
	public String fromDomainToValue(Study domain) {
		return domain.getNativeValue();
	}

	@Override
	public Study fromValueToDomain(String value) {
		return new STUDY(value);
	}

}
