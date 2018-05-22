package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.STUDY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Study;

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
