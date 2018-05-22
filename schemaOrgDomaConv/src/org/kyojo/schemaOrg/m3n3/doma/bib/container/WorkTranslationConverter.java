package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.WORK_TRANSLATION;
import org.kyojo.schemaOrg.m3n3.bib.Container.WorkTranslation;

@ExternalDomain
public class WorkTranslationConverter implements DomainConverter<WorkTranslation, String> {

	@Override
	public String fromDomainToValue(WorkTranslation domain) {
		return domain.getNativeValue();
	}

	@Override
	public WorkTranslation fromValueToDomain(String value) {
		return new WORK_TRANSLATION(value);
	}

}
